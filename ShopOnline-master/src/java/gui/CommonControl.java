/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author sonnt
 */
public class CommonControl {

    public static String generateHyperlink(String url, String label) {
        return "<li class=\"page-item\"><a class=\"sysHyperlink page-link\" href=\"" + url + "\">" + label + "</a></li>";
    }

    public static String generateTextbase(String text) {
        return "<li class=\"page-item active\">\n"
                + "      <span class=\"page-link\">\n"
                + "        "+ text+"\n"
                + "        <span class=\"sr-only\">(current)</span>\n"
                + "      </span></li>";
    }
    
}
