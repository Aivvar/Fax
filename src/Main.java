import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Main {
    public ArrayList<Kod_Dliny> table1, table2;
    List<String> stroki = new ArrayList<>();
    File file = new File("input.bmp");
    BufferedImage image = ImageIO.read(file);
    BufferedImage decoded_image=new BufferedImage(image.getWidth(),image.getHeight(),image.getType());
    Color black = new Color(0, 0, 0); // Color black
    Color white  = new Color(255, 255, 255); // Color white
    int rgb = black.getRGB();
    int rgb2 = white.getRGB();


    public Main() throws IOException {
    }

    public void init()
    {
        System.out.println("Изображение "+image.getWidth()+" "+image.getHeight());
        table1=new ArrayList<>();
        table1.add(new Kod_Dliny(0, "00110101" ,"0000110111"));
        table1.add(new Kod_Dliny(1,"000111", "010"));
        table1.add(new Kod_Dliny(2, "0111", "11"));
        table1.add(new Kod_Dliny(3, "1000", "10"));
        table1.add(new Kod_Dliny(4, "1011", "011"));
        table1.add(new Kod_Dliny(5, "1100", "0011"));
        table1.add(new Kod_Dliny(6, "1110", "0010"));
        table1.add(new Kod_Dliny(7, "1111", "00011"));
        table1.add(new Kod_Dliny(8, "10011", "000101"));
        table1.add(new Kod_Dliny(9, "10100", "000100"));
        table1.add(new Kod_Dliny(10, "00111", "0000100"));
        table1.add(new Kod_Dliny(11, "01000", "0000101"));
        table1.add(new Kod_Dliny(12, "001000", "0000111"));
        table1.add(new Kod_Dliny(13, "000011", "00000100"));
        table1.add(new Kod_Dliny(14, "110100", "00000111"));
        table1.add(new Kod_Dliny(15, "110101", "000011000"));
        table1.add(new Kod_Dliny(16, "101010", "0000010111"));
        table1.add(new Kod_Dliny(17,"101011", "0000011000"));
        table1.add(new Kod_Dliny(18,"0100111", "0000001000"));
        table1.add(new Kod_Dliny(19, "0001100", "00001100111"));
        table1.add(new Kod_Dliny( 20, "0001000", "00001101000"));
        table1.add(new Kod_Dliny(21, "0010111", "00001101100"));
        table1.add(new Kod_Dliny(22, "0000011", "00000110111"));
        table1.add(new Kod_Dliny(23, "0000100", "00000101000"));
        table1.add(new Kod_Dliny(24, "0101000", "00000010111"));
        table1.add(new Kod_Dliny(25, "0101011", "00000011000"));
        table1.add(new Kod_Dliny(26, "0010011", "000011001010"));
        table1.add(new Kod_Dliny(27, "0100100", "000011001011"));
        table1.add(new Kod_Dliny( 28, "0011000", "000011001100"));
        table1.add(new Kod_Dliny(29, "00000010", "000011001101"));
        table1.add(new Kod_Dliny(30, "00000011", "000001101000"));
        table1.add(new Kod_Dliny(31, "00011010", "000001101001"));
        table1.add(new Kod_Dliny(32, "00011011", "000001101010"));
        table1.add(new Kod_Dliny(33, "00010010", "000001101011"));
        table1.add(new Kod_Dliny(34, "00010011", "000011010010"));
        table1.add(new Kod_Dliny(35, "00010100", "000011010011"));
        table1.add(new Kod_Dliny(36, "00010101", "000011010100"));
        table1.add(new Kod_Dliny(37, "00010110", "000011010101"));
        table1.add(new Kod_Dliny(38, "00010111", "000011010110"));
        table1.add(new Kod_Dliny(39, "00101000", "000011010111"));
        table1.add(new Kod_Dliny(40, "00101001", "000001101100"));
        table1.add(new Kod_Dliny(41, "00101010", "000001101101"));
        table1.add(new Kod_Dliny(42, "00101011", "000011011010"));
        table1.add(new Kod_Dliny(43, "00101100", "000011011011"));
        table1.add(new Kod_Dliny(44, "00101101", "000001010100"));
        table1.add(new Kod_Dliny(45, "00000100", "000001010101"));
        table1.add(new Kod_Dliny(46, "00000101", "000001010110"));
        table1.add(new Kod_Dliny(47, "00001010", "000001010111"));
        table1.add(new Kod_Dliny(48, "00001011", "000001100100"));
        table1.add(new Kod_Dliny(49, "01010010", "000001100101"));
        table1.add(new Kod_Dliny(50, "01010011", "000001010010"));
        table1.add(new Kod_Dliny(51, "01010100", "000001010011"));
        table1.add(new Kod_Dliny(52, "01010101", "000000100100"));
        table1.add(new Kod_Dliny(53, "00100100", "000000110111"));
        table1.add(new Kod_Dliny(54, "00100101", "000000111000"));
        table1.add(new Kod_Dliny( 55, "01011000", "000000100111"));
        table1.add(new Kod_Dliny(56, "01011001", "000000101000"));
        table1.add(new Kod_Dliny(57, "01011010", "000001011000"));
        table1.add(new Kod_Dliny(58, "01011011", "000001011001"));
        table1.add(new Kod_Dliny(59, "01001010", "000000101011"));
        table1.add(new Kod_Dliny(60, "01001011", "000000101100"));
        table1.add(new Kod_Dliny(61, "00110010", "000001011010"));
        table1.add(new Kod_Dliny(62, "00110011", "000001100110"));
        table1.add(new Kod_Dliny(63, "00110100", "000001100111"));

        table2 = new ArrayList<>();
        table2.add(new Kod_Dliny(64,"11011", "0000001111"));
        table2.add(new Kod_Dliny( 128 ,"10010","000011001000"));
        table2.add(new Kod_Dliny( 192 ,"010111" ,"000011001001"));
        table2.add(new Kod_Dliny(256,"0110111", "000001011011"));
        table2.add(new Kod_Dliny(320, "00110110" ,"000000110011"));
        table2.add(new Kod_Dliny( 384 ,"00110111" ,"000000110100"));
        table2.add(new Kod_Dliny(448 ,"01100100" ,"000000110101"));
        table2.add(new Kod_Dliny(  512 ,"01100101" ,"0000001101100"));
        table2.add(new Kod_Dliny( 576 ,"01101000","0000001101101"));
        table2.add(new Kod_Dliny(640 ,"01100111", "0000001001010"));
        table2.add(new Kod_Dliny(704 ,"011001100", "0000001001011"));
        table2.add(new Kod_Dliny(768, "011001101", "0000001001100"));
        table2.add(new Kod_Dliny(832,"011010010", "0000001001101"));
        table2.add(new Kod_Dliny( 896, "011010011","0000001110010"));
        table2.add(new Kod_Dliny(960 ,"011010100", "0000001110011"));
        table2.add(new Kod_Dliny(1024, "011010101", "0000001110100"));
        table2.add(new Kod_Dliny(1088, "011010110" ,"0000001110101"));
        table2.add(new Kod_Dliny(1152 ,"011010111" ,"0000001110110"));
        table2.add(new Kod_Dliny(1216, "011011000", "0000001110111"));
        table2.add(new Kod_Dliny(1280 ,"011011001", "0000001010010"));
        table2.add(new Kod_Dliny(1344, "011011010" ,"0000001010011"));
        table2.add(new Kod_Dliny(1408 ,"011011011", "0000001010100"));
        table2.add(new Kod_Dliny(1472 ,"010011000", "0000001010101"));
        table2.add(new Kod_Dliny( 1536 ,"010011001", "0000001011010"));
        table2.add(new Kod_Dliny(1600 ,"010011010", "0000001011011"));
        table2.add(new Kod_Dliny(1664 ,"011000" ,"0000001100100"));
        table2.add(new Kod_Dliny(1728 ,"010011011", "0000001100101"));
        table2.add(new Kod_Dliny( 1792 ,"00000001000", "00000001000"));
        table2.add(new Kod_Dliny(1856 ,"00000001100" ,"00000001100"));
        table2.add(new Kod_Dliny(1920 ,"00000001101" ,"00000001101"));
        table2.add(new Kod_Dliny(1984 ,"000000010010" ,"000000010010"));
        table2.add(new Kod_Dliny(2048 ,"000000010011" ,"000000010011"));
        table2.add(new Kod_Dliny(2112 ,"000000010100" ,"000000010100"));
        table2.add(new Kod_Dliny(2176 ,"000000010101", "000000010101"));
        table2.add(new Kod_Dliny( 2240 ,"000000010110", "000000010110"));
        table2.add(new Kod_Dliny(2304 ,"000000010111", "000000010111"));
        table2.add(new Kod_Dliny(  2368, "000000011100", "000000011100"));
        table2.add(new Kod_Dliny(2432 ,"000000011101", "000000011101"));
        table2.add(new Kod_Dliny(2496 ,"000000011110", "000000011110"));
        table2.add(new Kod_Dliny(2560 ,"000000011111", "000000011111"));
    }
    Kod_Dliny  getCode(int table_number,int count) {
        Predicate<Kod_Dliny> predicate = c-> c.count==count;
        Kod_Dliny  obj;
        if(table_number==1)
            obj= table1.stream().filter(predicate).findFirst().get();
        else
        {
            obj= table2.stream().filter(predicate).findFirst().get();
        }

        return obj;
    }
    Kod_Dliny  getCount(int table_number,int color,String cod) {
        Predicate<Kod_Dliny> predicate;
        if(color==1) predicate = c-> c.white_cod.equals(cod);
        else predicate = c-> c.black_cod.equals(cod);
        Kod_Dliny  obj=null;
        if(table_number==1)
        {
            if(table1.stream().anyMatch(predicate))
            obj= table1.stream().filter(predicate).findFirst().get();
        }
        else
        {
            if(table2.stream().anyMatch(predicate))
            obj= table2.stream().filter(predicate).findFirst().get();
        }
        return obj;
    }
    private void run() throws IOException {
        init();
        for (int y = 0; y < image.getHeight(); y++)
            for (int x = 0; x < image.getWidth(); x++)
            decoded_image.setRGB(x,y,0);
        int count1 = 0, count2 = 0, intens, curr_intens;
        StringBuilder kod_stroki,kod_file=new StringBuilder();
        Color color;
        // Делаем двойной цикл, чтобы обработать каждый пиксель
        for (int y = 0; y < image.getHeight(); y++) {
            kod_stroki = new StringBuilder();
            color = new Color(image.getRGB(0, y));
            curr_intens = color.getGreen();
            System.out.println("Строка " + y);
           if(curr_intens==255)
            {
                kod_stroki.append("000111");
            }
            else {
                kod_stroki.append("00110101");
            }
            for (int x = 0; x < image.getWidth(); x++) {
                // Получаем цвет текущего пикселя
                color = new Color(image.getRGB(x, y));
                intens = color.getGreen();
                if (intens == curr_intens) {
                    if (intens == 255)
                        count1++;
                    else count2++;
                } else {
                    if (curr_intens == 255) {
                        //System.out.println("Цвет был белый");
                        if (count1 < 64) kod_stroki.append(getCode(1, count1).white_cod);
                        else {
                            kod_stroki.append(getCode(2, (count1 / 64) * 64).white_cod);
                            kod_stroki.append(getCode(1, count1 % 64).white_cod);
                        }
                    }
                    if (curr_intens == 0) {
                        //System.out.println("Цвет был черный");
                        if (count2 < 64) kod_stroki.append(getCode(1, count2).black_cod);
                        else {
                            kod_stroki.append(getCode(2, (count2 / 64) * 64).black_cod);
                            kod_stroki.append(getCode(1, count2 % 64).black_cod);
                        }
                    }
                    if (curr_intens == 255) count2 = 1;
                    else count1 = 1;
                    curr_intens = intens;
                }
                if (x == image.getWidth() - 1) {
                    if (curr_intens == 255) {
                       // System.out.println("Цвет был белый");
                        if (count1 < 64) kod_stroki.append(getCode(1, count1).white_cod);
                        else {
                            kod_stroki.append(getCode(2, (count1 / 64) * 64).white_cod);
                            kod_stroki.append(getCode(1, count1 % 64).white_cod);
                        }
                    }
                    if (curr_intens == 0) {
                        //System.out.println("Цвет был черный");
                        if (count2 < 64) kod_stroki.append(getCode(1, count2).black_cod);
                        else {
                            kod_stroki.append(getCode(2, (count2 / 64) * 64).black_cod);
                            kod_stroki.append(getCode(1, count2 % 64).black_cod);
                        }
                    }
                }
            }
                kod_stroki.append("000000000001");
                stroki.add(kod_stroki.toString());
                System.out.println("Код " + stroki.get(y));
                count1 = 0;
                count2 = 0;
            }
            for(String s:stroki)
                kod_file.append(s);
        while (kod_file.length()%8>0)
            kod_file.append("0");
        byte [] data= new byte[kod_file.length()/8];
        int bytecount=0;
        for(int count=0;count<kod_file.length();count+=8)
        {
            data[bytecount]=(byte) Integer.parseInt(kod_file.substring(count, count + 8), 2);
            bytecount++;
        }
        String codedS = new String(data, StandardCharsets.UTF_8);
        //System.out.println("В UTF-8 результат: "+codedS);
        try {
            BufferedWriter out = new BufferedWriter( new FileWriter("coded"));
            out.write(codedS);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Decod();
        JLabel picLabel = new JLabel(new ImageIcon(image));
        JLabel picLabe2 = new JLabel(new ImageIcon(decoded_image));
        JPanel jPanel1 = new JPanel();
        jPanel1.add(picLabel);
        JPanel jPanel2 = new JPanel();
        jPanel2.add(picLabe2);
        JFrame f = new JFrame("Исходное");
        f.setSize(new Dimension(image.getWidth(), image.getHeight()));
        f.add(jPanel1);
        JFrame f2 = new JFrame("Декодированное");
        f2.setSize(new Dimension(image.getWidth(), image.getHeight()));
        f2.add(jPanel2);
        f.setVisible(true);
        f2.setVisible(true);

        }
public void Decod()
{
    StringBuilder decod_temp=new StringBuilder();
    StringBuilder decod=new StringBuilder();
    System.out.println("Декодирование");

    int way=0,decod_count,row_number=0,column_number=0;

    for (int row=0;row<stroki.size()-1;row++) {
        System.out.println("Строка "+row+" "+stroki.get(row));
        for (char c : stroki.get(row).toCharArray()) {
            decod_temp.append(c);
            if (way == 1) {
                if (getCount(2, 1, decod_temp.toString()) != null) {
                    decod_count = getCount(2, 1, decod_temp.toString()).count;
                    decod_temp = new StringBuilder();
                    for(int col=column_number;col<decod_count+column_number;col++)
                    {
                        System.out.println("Колво"+decod_count);
                        System.out.println("Столбец"+col+"Строка"+row);
                        decoded_image.setRGB(col,row,rgb2);
                    }
                    column_number+=decod_count;
                    System.out.println("Добавились белые "+decod_count);
                    System.out.println("Текущее положение в строке"+column_number);
                } else if (getCount(1, 1, decod_temp.toString()) != null) {
                    decod_count = getCount(1, 1, decod_temp.toString()).count;
                    decod_temp = new StringBuilder();
                    way = 2;

                    for(int col=column_number;col<decod_count+column_number;col++)
                    {
                        System.out.println("Столбец"+col+"Строка"+row);
                        decoded_image.setRGB(col,row,rgb2);
                    }
                    column_number+=decod_count;
                    System.out.println("Добавились белые "+decod_count);
                    System.out.println("Текущее положение в строке"+column_number);
                }
                if (decod_temp.toString().equals("000000000001")) {
                    System.out.println("Конец строки");
                    way=0;
                    decod_temp = new StringBuilder();
                    column_number=0;
                }
            }
            if (way == 2) {

                if (getCount(2, 0, decod_temp.toString()) != null) {
                    decod_count = getCount(2, 0, decod_temp.toString()).count;
                    decod_temp = new StringBuilder();
                    for(int col=column_number;col<decod_count+column_number;col++)
                    decoded_image.setRGB(col,row,rgb);
                    System.out.println("Добавились черные "+decod_count);
                    column_number+=decod_count;
                    System.out.println("Текущее положение в строке"+column_number);
                } else if (getCount(1, 0, decod_temp.toString()) != null) {
                    decod_count = getCount(1, 0, decod_temp.toString()).count;
                    decod_temp = new StringBuilder();
                    way = 1;
                    System.out.println("Добавились черные "+decod_count);
                    for(int col=column_number;col<decod_count+column_number;col++)
                        decoded_image.setRGB(col,row,rgb);
                    column_number+=decod_count;
                    System.out.println("Текущее положение в строке"+column_number);
                }
                if (decod_temp.toString().equals("000000000001"))
                { System.out.println("Конец строки");
                    way=0;
                    decod_temp = new StringBuilder();
                    column_number=0;
                }

            }
            if (decod_temp.toString().equals("000111")) {
                System.out.println("Строка начинается с белых");
                decod_temp = new StringBuilder();
                way = 1;
            }
            if (decod_temp.toString().equals("00110101")) {
                System.out.println("Строка начинается с черных");
                decod_temp = new StringBuilder();
                way = 2;
            }
        }

    }
}
    public static void main(String[] args) throws IOException {
        long startTIME = System.currentTimeMillis();
        new Main().run();
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTIME + "ms");
    }
}