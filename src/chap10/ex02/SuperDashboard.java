package chap10.ex02;

import java.awt.Component;

import javax.swing.JFrame;

public class SuperDashboard extends JFrame implements MetaDataUser{
	public Component getLastFocusedComponent() {return null;}
	public void setlastFocused(Component component) {}
	public int getMajorVersionNumber() {return 0;}
	public int getMinorVersionNumber() {return 0;}
	public int getBuildNumber() {return 0;}
}
