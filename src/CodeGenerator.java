
import java.util.HashMap;
import java.util.Map;

//---------------------------------------------------------------
//         Project
//         CodeGenerator.java
//         Mimics Netbeans code shortcuts.
//---------------------------------------------------------------

public class CodeGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Map<String, String> shortcuts = new HashMap<>();
        shortcuts.put("for", "for (int i = 0; i < 10; i++) {\n\n" + "}");
        shortcuts.put("if", "if (true) {\n\n" + "}");
        shortcuts.put("do", "do {\n\n" + "} while (true)");
        shortcuts.put("dowhile", "do {\n\n" + "} while (true)");
        shortcuts.put("sout", "System.out.println(\"\");");
        shortcuts.put("while", "while (true) {\n\n" + "}");
        shortcuts.put("ca", "catch (Exception ex) {\n\n" + "}");
        shortcuts.put("cl", "class");
        shortcuts.put("cn", "continue");
        shortcuts.put("db", "double");
        shortcuts.put("df", "default");
        shortcuts.put("cn", "continue");
        shortcuts.put("eq", "equals");
        shortcuts.put("ex", "extends");
        shortcuts.put("fa", "false");
        shortcuts.put("fcom", "//<editor-fold defaultstate=\"collapsed\" desc=\"comment\">\n\n//</editor-fold>");
        shortcuts.put("fi", "final");
        shortcuts.put("forc", "for (Iterator iterator = col.iterator();\n"
                            + "   iterator.hasNext();) {\n"
                            + "   Object next = iterator.next();\n}");
        shortcuts.put("fore", "for (String arg : args) {\n\n}");
        shortcuts.put("fori", "for (int i = 0; i < args.length; i++) {\n"
                            + "            String arg = args[i];\n\n}");
        shortcuts.put("forl", "for (int i = 0; i < lst.size(); i++) {\n"
                            + "            Object get = lst.get(i);\n\n}");
        shortcuts.put("forst", "for (StringTokenizer st = new \n"
                            + " StringTokenizer(\"\"); st.hasMoreTokens();) ");
        shortcuts.put("forv", "for (int i = 0; i < vct.size(); i++) {\n"
                            + "            Object elementAt = vct.elementAt(i);\n\n}");
        shortcuts.put("fy", "finally {\n\n}");
        shortcuts.put("ie", "interface");
        shortcuts.put("ifelse", "if (true) {\n\n} else {\n}");
        shortcuts.put("iff", "if (true) {\n\n}");
        shortcuts.put("im", "implements");
        shortcuts.put("inst", "if (in instanceof Object) {\n"
                            + "  Object object = (Object) in;\n\n}");
        shortcuts.put("iof", "instanceof");
        shortcuts.put("ir", "import");
        shortcuts.put("le", "length");
        shortcuts.put("na", "native");
        shortcuts.put("newo", "Object object = new Object();");
        shortcuts.put("pe", "protected");
        shortcuts.put("pr", "private");        
        shortcuts.put("psf", "private static final"); 
        shortcuts.put("psfb", "private static final boolean"); 
        shortcuts.put("psfi", "private static final int"); 
        shortcuts.put("psfs", "private static final String"); 
        shortcuts.put("pst", "printStackTrace();"); 
        shortcuts.put("psvm", "public static void main(String[] args) {\n\n}"); 
        shortcuts.put("pu", "public"); 
        shortcuts.put("re", "return"); 
        shortcuts.put("runn", "Runnable runnable = new Runnable() {\n"
                    + "            public void run() {\n\n}\n};"); 
        shortcuts.put("serr", "System.err.println(\"\");"); 
        shortcuts.put("sh", "short"); 
        shortcuts.put("sout", "System.out.println(\"\");"); 
        shortcuts.put("soutv", "System.out.println(\"in = \" + in);"); 
        shortcuts.put("st", "static"); 
        shortcuts.put("su", "super"); 
        shortcuts.put("sw", "switch (var) {\ncase val:\n\n"
                    + "            break;\ndefault:\nthrow new AssertionError();\n}"); 
        shortcuts.put("sy", "synchronized"); 
        shortcuts.put("tds", "Thread.dumpStack();"); 
        shortcuts.put("th", "throws"); 
        shortcuts.put("tr", "transient"); 
        shortcuts.put("trycatch", "try {\n\n} catch (Exception e) {\n}"); 
        shortcuts.put("tw", "throws"); 
        shortcuts.put("vo", "volatile"); 
        shortcuts.put("wh", "while (true) {\n\n}"); 
        shortcuts.put("whileit", "while (it.hasNext()) {\n"
                    + "            Object next = it.next();\n\n}"); 
        shortcuts.put("whilen", "while (en.hasMoreElements()) {\n"
                    + "            Object nextElement = en.nextElement();\n\n}"); 
        shortcuts.put("whilexp", "while (true) {\n\n}"); 
        shortcuts.put("al", "List<String> arrayList = new ArrayList<String>();"); 
        shortcuts.put("br", "break;");
        
         
        String in = "FOR";
        System.out.println(shortcuts.get(in.toLowerCase()));
    }
}
