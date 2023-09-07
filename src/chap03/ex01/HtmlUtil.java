package chap03.ex01;

public class HtmlUtil {
    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData,
            boolean includeSuiteSetup) throws Exception {
        if (isTestPage(pageData)) {
            includeSetupAndTeardownPages(pageData, includeSuiteSetup);
        }
        return pageData.getHtml();
    }

    private static void includeSetupAndTeardownPages(PageData pageData, boolean includeSuiteSetup) {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer newPageContent = new StringBuffer();
        includeSetupPages(includeSuiteSetup, wikiPage, newPageContent);
        newPageContent.append(pageData.getContent());
        includeTeardownPages(includeSuiteSetup, wikiPage, newPageContent);
        pageData.setContent(newPageContent.toString());
    }

    private static boolean isTestPage(PageData pageData) {
        return pageData.hasAttribute("Test");
    }

    private static void includeTeardownPages(boolean includeSuiteSetup, WikiPage wikiPage, StringBuffer newPageContent) {
        WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
        if (teardown != null) {
            WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
            String tearDownPathName = PathParser.render(tearDownPath);
            newPageContent.append("\n")
                    .append("!include -teardown .")
                    .append(tearDownPathName)
                    .append("\n");
        }
        if (includeSuiteSetup) {
            WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(
                    SuiteResponder.SUITE_TEARDOWN_NAME,
                    wikiPage);
            if (suiteTeardown != null) {
                WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                String pagePathName = PathParser.render(pagePath);
                newPageContent.append("!include -teardown .")
                        .append(pagePathName)
                        .append("\n");
            }
        }
    }

    private static void includeSetupPages(boolean includeSuiteSetup, WikiPage wikiPage, StringBuffer newPageContent) {
        if (includeSuiteSetup) {
            WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(
                    SuiteResponder.SUITE_SETUP_NAME, wikiPage);
            if (suiteSetup != null) {
                WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                String pagePathName = PathParser.render(pagePath);
                newPageContent.append("!include -setup .")
                        .append(pagePathName)
                        .append("\n");
            }
        }
        WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
        if (setup != null) {
            WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
            String setupPathName = PathParser.render(setupPath);
            newPageContent.append("!include -setup .")
                    .append(setupPathName)
                    .append("\n");
        }
    }
}

/*
 * 예제용 더미 클래스
 */
class PageData {
    public WikiPage getWikiPage() {
        return null;
    }

    public String getHtml() {
        return null;
    }

    public void setContent(String string) {
    }

    public Object getContent() {
        return null;
    }

    public boolean hasAttribute(String string) {
        return false;
    }
}

class WikiPage {
    public WikiPagePath getPageCrawler() {
        return null;
    }
}

interface PageCrawler {

}

class PageCrawlerImpl implements PageCrawler {

    public static WikiPage getInheritedPage(String suiteSetupName, WikiPage wikiPage) {
        return null;
    }
}

class SuiteResponder {

    public static final String SUITE_TEARDOWN_NAME = "TearDown";
    public static final String SUITE_SETUP_NAME = "SetUp";
}

class WikiPagePath {

    public WikiPagePath getFullPath(WikiPage suiteSetup) {
        return null;
    }
}

class PathParser {

    public static String render(WikiPagePath pagePath) {
        return null;
    }

}