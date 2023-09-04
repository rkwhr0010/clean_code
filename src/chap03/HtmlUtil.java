package chap03;

public class HtmlUtil {
    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute("Test")) {
            if(includeSuiteSetup) {
                WikiPage suiteSetup = 
                    PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage); 
                if(suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -setup .")
                        .append(pagePathName)
                        .append("\n");
                }
            }
        }
        WikiPage setUp = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
        if(setUp != null) {
            WikiPagePath setUpPath = wikiPage.getPageCrawler().getFullPath(setUp);
            String setupPathName = PathParser.render(setUpPath);
            buffer.append("!include -setup .")
                .append(setupPathName)
                .append("\n");
        }
        buffer.append(pageData.getContent());
        if(pageData.hasAttribute("Test")) {
            WikiPage teardown = 
                PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
            if(teardown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n")
                    .append("!include -teardown .")
                    .append(tearDownPathName)
                    .append("\n");
            }
            if(includeSuiteSetup) {
                WikiPage suiteTearDown = 
                    PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
                if(suiteTearDown != null) {
                    WikiPagePath pagePath = wikiPage.getPageCrawler().getFullPath(teardown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("\n")
                        .append("!include -teardown .")
                        .append(pagePathName)
                        .append("\n");
                }
            }
        }
        pageData.setContent(buffer.toString());
        return pageData.getHtml();

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
class PageCrawlerImpl implements PageCrawler{

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