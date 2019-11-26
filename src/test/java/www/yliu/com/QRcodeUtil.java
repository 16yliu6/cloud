////import com.swetake.util.Qrcode;
//
//import javax.imageio.ImageIO;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//
//public class QRcodeUtil {
//    public void qrcodeEncode(String content, String imgPath) {
//        this.qrcodeEncode(content, imgPath, "png", 7);
//    }
//
//    public void qrcodeEncode(String content, String imgPath, String imgType, int size) {
//        BufferedImage bufferedImage = this.qrcodeImg(content, imgType, size);
//        File file = new File(imgPath);
//        try {
//            ImageIO.write(bufferedImage, imgType, file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private BufferedImage qrcodeImg(String content, String imgType, int size) {
//        BufferedImage bufferedImage = null;
//        Qrcode qrcode = new Qrcode();
//        qrcode.setQrcodeErrorCorrect('M');//纠错率
//        qrcode.setQrcodeEncodeMode('B');
//        qrcode.setQrcodeErrorCorrect('7');
//
//        int imgSize = 67 + 12 * (size - 1);
//        bufferedImage = new BufferedImage(imgSize, imgSize, BufferedImage.TYPE_INT_RGB);
//        Graphics2D graphics = bufferedImage.createGraphics();//创建图层
//        graphics.setBackground(Color.WHITE);//背景颜色
//        graphics.clearRect(0 ,0, imgSize, imgSize);//矩形
//        graphics.setColor(Color.BLACK);//图像颜色
//        int pixoff = 2;//偏移量
//
//        try {
//            byte[] bytes = content.getBytes("GBK");
//            if (bytes.length > 0 && bytes.length < 120) {
//                //写入图片
//                boolean[][] calQrcode = qrcode.calQrcode(bytes);
//                for (int i = 0; i < calQrcode.length; i++) {
//                    for (int j = 0; j < calQrcode.length; j++) {
//                        if (calQrcode[j][i]) {
//                            graphics.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
//                        }
//                    }
//                }
//            }
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//
//        graphics.dispose();//释放资源
//        bufferedImage.flush();//刷新
//        return bufferedImage;
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
////        <dependency>
////      <groupId>QRCode</groupId>
////      <artifactId>QRCode</artifactId>
////      <version>3.0</version>
////    </dependency>
//
//}
