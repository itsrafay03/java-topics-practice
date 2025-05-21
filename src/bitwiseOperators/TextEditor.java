// A program to show the use of Bit-wise Operators.

package bitwiseOperators;
public class TextEditor {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int UNDERLINE = 4;
    public static final int STRIKE_THROUGH = 8;
    public int fontStyle;

    // Default Constructor.
    public TextEditor(){

    }
    // Parametrized Constructor.
    public TextEditor(int fontStyle){
        this.fontStyle = fontStyle;
    }

    // Getters Setters.
    public void setFontStyle(int fontStyle){
        this.fontStyle = fontStyle;
    }
    public int getFontStyle(){
        return fontStyle;
    }

    // Method to Bold.
    public void boldClicked(){
        fontStyle ^= BOLD;
    }
    // Method to Italic.
    public void italicClicked(){
        fontStyle ^= ITALIC;
    }
    // Method to Underline.
    public void underlineClicked(){
        fontStyle ^= UNDERLINE;
    }
    // Method to Strike_Through.
    public void strikeThroughClicked(){
        fontStyle ^= STRIKE_THROUGH;
    }

}

/*
        TextEditor textEditor = new TextEditor();
        System.out.println(textEditor.getFontStyle());
        System.out.println(Integer.toBinaryString(textEditor.getFontStyle()));

        textEditor.strikeThroughClicked();
        System.out.println(textEditor.getFontStyle());
        System.out.println(Integer.toBinaryString(textEditor.getFontStyle()));

        textEditor.boldClicked();
        System.out.println(textEditor.getFontStyle());
        System.out.println(Integer.toBinaryString(textEditor.getFontStyle()));

        textEditor.italicClicked();
        textEditor.strikeThroughClicked();
        System.out.println(textEditor.getFontStyle());
        System.out.println(Integer.toBinaryString(textEditor.getFontStyle()));
 */
