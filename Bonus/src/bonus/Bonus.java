
package bonus;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;

public class Bonus {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] MSGS_Hexa ={"ED1014822BBB7B0956D17F0DFEDAAAE2CF1302CB7CC17C8F131F6080281E767928185E182AD4930655B9B42BCA454301E4E0DC92F1EF00073B48CAE65D17854966B14CBA3DC7DBB8B998E5464D8ACC68EF78928495D5EA9668F76070ACC3200F9FA29D54EFD4AB90C3B82348D344C8D66073775DEC5D659DD34A4574C29CE46CCD81A61E0F9703C2635CCDFFBC7D1A6BCB8C07ABC277307E78C82C38842C649724069DEFEAC5A7434434B01AFCF8B00594EDA36B5CCC298DFEB109BE36C6804C04E4B93F48A3575386050090DAA6CD7EFB3E7D95EAE1ED0CF51F8E7E528349889E57CDA92A1B9C6E10BBF85717FFCF1A068CA2836B195B",
                        "C910118230FE60595CCB670DF4C8E4ABC05F1DC528DD61CA52056CC9324A227131155E012DC5DD4740A1A072D7004400E4F9D196BFE40B13230DDAFD120A83543CB172B13DC7C1B4FC9EA45149CDD666EC73D6D09FCBBED72FF66B66B7C53A4A9DED861AAE87B492D5EC295CD3448DC028776A5AB81260D4C0474879879FF27B89C4A60C04D00FCC7119CEB3BB691D2E",
                        "CD1014822BBB7B0956D17F0DFEDAAAFFC9564EC767DB668F111E69CD2E047672261313562AC693457EBCB037D20C4F03E6BA94BFBEFA00022A1A89E35D0C830C29FF7FFF70DCDBB4FC8CA05D52C6C129F86FD7D083C4FDDD2FF36071FED63D189EE6D455A987B18ECFF62B0E8758C593337F754BB80E7399C7434C2D968CEF7D89CEBC1A13D017CD6019D1A9BB7A4E2AC58B4EBC",
                        "F61A469027F5665951CB3245F6DFEFABD25C03CF28DC77D7065170C8201E767026040D1862D4930A5CAFBB72D80B5810ACFDDA90F1E40B543F09DBFA5B1D934029E33BB568C0DDF1A893E55B4CCECD6AF869D7D084C5FFC22FB06670ACC7740388A28352AAD5A1DDD2F0290E8755D8C760697142F45D709195",
                        "D61A46862AF732124BCB650DE3C1EFABD4401BCB648878C019147780200839613D410A1E208094341EEEBC3C9942680B90B39484A5EC0B102606CEAE5411940C6FC27EBC68C1C0A5A5DBEB126BDE837AB975D38294C1E7966EB27D70BDD0311EDBF69C5BBB87B798C5ED3E47874980DA2E3E7D43FA187690D24B096C8C8DB767CCD5BD10139B13C7245DDBA9B76B0B38828354F2CC6E7C3F7EC26371856A7497395699BDE7D0B117073CBC10A9E3B30592EDBE64",
                        "A13E0A8B66DA701650D0326EFEDBE9FEC8471D8A61DB32DF071368C932023F7A2E411F5636C5C10E5CBDF53DDF454016B0FDD79BB4FE451B2148CCE3501B82482DF53BAC78D0DCA3B588BC1255C3D061B97C928384DFF1D868B2687ABDD7274A94ECD454AAD3B392D4F36C5D9653D5C1296A61",
                        "C51602C73FF4675951D66B0DE3C6AAFED2564ED367DD608F100365C92F4A227B2D00074965E9930550BAF52BD610010CA5E2D199F6F9450D2A1C88AE610A875E3CB175B06A",
                        "C00C15922BFE320D4DC5660DFE89E2EAD7564ECE6DCE7BC1171524CE241D7646280F1A192888875510EEBC3C99064D05B7E79496BFE9451D2148C8E05D0A8E493AB178B37CC0DAF1B5DCA45543C3CA29FD72929E95DABEE46EFC6A7AB38A7D4A94EC9843EFC6AA9986F16C499C4480D729787E4BEA187C80975D4C7E9785E327878FA30C41841EC6765C9EBEB0714E3FC7894FBCC473657A2AD964309E2C69D2341796BDF8D4B6435830BB1AB3FAF65683E9A92F54CD669BFAA511E77FC9CE514BF7A46D07B14F16981D4E94C3A6D968FB24389CEBB5B80CB413857E418F44949757CAA83C1B8E7D52A5ED5715F7CA491CD8E79D6B051E97A569B3A12E389D80F0493972C468915E113E5F473B0E34838C192D3ABDCCD9E5C6EA4B92651E35C04FC9DC340C887F1D9690D3B61272104A86464174F8035EE7FE5649E229C557D1FFB7",
                        "C80B468A2FFC7A0D05D77748FA89FFE5D35602CB7CCD768F01186AC3244A3F60690C1B0420CCCA474AABB03FCA45550BE4F6D1D7B0AD17112909CAFA5D0CC64E3DE53BB66993C0A2FC98A0544BC4CD7DFC71CBD082C8F2D77BF76A3BFEED044A8CE3871ABDC2E994C8EB384F9D44C9D234777649B8097A91977D48638686FA29CEC4A41A139102CC7619DBA9BB7A176BD6834AB78D76787A2AC06925826364D220178BBDE8D0AE0F4F35",
                        "D10D09852AFE7F594CD73259FFC8FEABD85C1B8A7BCD77CB52056CC56118377A2D0E135622C5DD024BAFA13DCB454003A5FDDAD9F1C813113D1189FA5B13830C31FE6EFF6ED6CCB5FC95B11256C2C129F073DB8499CCF2"   
        };
        
        String Target = "D51703C735FE710B40D03240F2DAF9EAC6564EC37B9232F81A146A8034193F7A2E411F5636D4C10258A3F531D0154901B6B4DA92A7E817543A1BCCAE4616830C23F462FF70DCDBB4FC88AD534C8ACB67FA7892D8C194AC813FA03A3C";
        String Target_Binary =hex2binary(Target);
        
        String [] MSGS_Binary = new String [10];
        
        StringBuilder [] M_Xor_T = new StringBuilder [10];
        
        
        for (int i = 0; i < MSGS_Binary.length; i++) {
            MSGS_Binary[i]= hex2binary(MSGS_Hexa[i]);
        }
        
       // System.out.println(Target_Binary);
        for (int i = 0; i < 10; i++) {
            M_Xor_T[i] = first_xor(Target_Binary,MSGS_Binary[i]);
        }
        
        String s = "abcdefghijklmnopqrstuvwxyz";
        String gf = convertStringToBinary(s);
        
        for (int k = 0; k < gf.length() ; k=k+8) {
            for (int j = 0; j < gf.length() ; j = j+8) {
                String essam ="";
                char c = '0';
                for (int i = 0; i < M_Xor_T.length ; i++) {
                    
                    StringBuilder u = first_xor (gf.substring(j, j+8) , M_Xor_T[i].substring(k, k+8));
                    
                    StringBuilder binary = new StringBuilder(u);
                        //System.out.println(binaryToChar(binary));
                         c = binaryToChar(binary);
                        essam += c ;
                }
                 if(ynf3(essam)){
                    System.out.print(c);

                 }
            }
            
        }
        // The secret message is: When using a stream cipher never use the key more than once (1927022)  
        // rpq vtuozy tlelmsm  w: 89 iedkjhwvutsqpmtlonhjdfxyat 98zyozy10( s 12t
        
    }
    
    public static String hex2binary(String hex) {
    StringBuilder result = new StringBuilder(hex.length() * 4);
    for (char c : hex.toUpperCase().toCharArray()) {
        switch (c) {
        case '0': result.append("0000"); break;
        case '1': result.append("0001"); break;
        case '2': result.append("0010"); break;
        case '3': result.append("0011"); break;
        case '4': result.append("0100"); break;
        case '5': result.append("0101"); break;
        case '6': result.append("0110"); break;
        case '7': result.append("0111"); break;
        case '8': result.append("1000"); break;
        case '9': result.append("1001"); break;
        case 'A': result.append("1010"); break;
        case 'B': result.append("1011"); break;
        case 'C': result.append("1100"); break;
        case 'D': result.append("1101"); break;
        case 'E': result.append("1110"); break;
        case 'F': result.append("1111"); break;
        default: throw new IllegalArgumentException("Invalid hex: '" + hex + "'");
        }
    }
    return result.toString();
}
    
    public static StringBuilder first_xor(String T ,String M){
        
        StringBuilder result = new StringBuilder(T.length());
        if(T.length() < M.length()){
        for (int i = 0; i < T.length(); i++) {
            result.append(M.charAt(i) ^ T.charAt(i));
        }
        }else{
            for (int i = 0; i < M.length(); i++) {
            result.append(M.charAt(i) ^ T.charAt(i));
        }
        }
        return result ;
    }
    
     public static String convertStringToBinary(String input) {

        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char aChar : chars) {
            result.append(
                    String.format("%8s", Integer.toBinaryString(aChar))   // char -> int, auto-cast
                            .replaceAll(" ", "0")                         // zero pads
            );
        }
        return result.toString();

    }
    
     public static char binaryToChar(StringBuilder binary) {
    int asciiValue = Integer.parseInt(binary.toString(), 2);
    return (char) asciiValue;
}
     
      public static boolean ynf3 (String Abdo){
            boolean flag = true ;
            
            for (int i = 0; i < Abdo.length(); i++) {
             char c = Abdo.charAt(i);
 
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')||(c >= '0' && c <= '9')||(c=='(')||(c==')')||(c==':')||(c==' '))
               continue;
            else
                flag = false;
            }
            
            if(flag){
                 return true ;
            }else{
                 return false ;
            }
        
     } 
}
