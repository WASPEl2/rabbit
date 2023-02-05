import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1_64050285_64050543 extends JPanel {
    public static void main(String[] args) {
        Assignment1_64050285_64050543 m = new Assignment1_64050285_64050543();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        BufferedImage bf = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bf.createGraphics();
        g2.setColor(Color.decode("#b4c076"));
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.WHITE);
        /* lower face line */
        bezierCurve(g2, 188, 160, 163, 177, 150, 213, 159, 242);
        bezierCurve(g2, 159, 242, 183, 322, 302, 365, 371, 321);
        bezierCurve(g2, 371, 321, 404, 306, 429, 235, 422, 196);
        bresenhamsLine(g2, 212, 128, 188, 160);
        bresenhamsLine(g2, 360, 111, 386, 136);
        /* left ear */
        bezierCurve(g2, 212, 128, 207, 77, 280, 46, 320, 73);
        bezierCurve(g2, 320, 73, 343, 84, 359, 89, 360, 111);

        bresenhamsLine(g2, 422, 196, 500, 206);

        /* right ear */
        bezierCurve(g2, 386, 136, 405, 127, 448, 121, 472, 127);
        bezierCurve(g2, 472, 127, 542, 85, 558, 132, 560, 153);
        bezierCurve(g2, 560, 153, 558, 186, 524, 209, 500, 206);

        bf = floodfill(bf, 300, 200, Color.WHITE);

        bresenhamsLine(g2, 119, 269, 165, 236);
        // bunny body white bg
        bezierCurve(g2, 119, 269, 93, 275, 81, 303, 93, 325);
        bresenhamsLine(g2, 93, 325, 82, 339);
        /* left foot */
        bezierCurve(g2, 82, 339, 67, 329, 55, 327, 42, 333);
        bezierCurve(g2, 42, 333, 19, 345, 16, 383, 29, 404);
        bezierCurve(g2, 29, 404, 45, 428, 103, 431, 115, 412);

        bresenhamsLine(g2, 148, 432, 111, 412);
        /* right foot */
        bezierCurve(g2, 232, 486, 235, 506, 220, 533, 199, 540);
        bezierCurve(g2, 199, 540, 164, 545, 137, 531, 127, 493);
        bezierCurve(g2, 127, 493, 124, 477, 129, 464, 141, 455);

        bresenhamsLine(g2, 148, 432, 141, 455);
        bresenhamsLine(g2, 232, 486, 291, 385);
        /* rt hand */
        bezierCurve(g2, 339, 330, 352, 339, 424, 374, 395, 418);
        bezierCurve(g2, 395, 418, 351, 458, 331, 407, 290, 384);

        bf = floodfill(bf, 170, 350, Color.WHITE);

        // cheeks line
        g2.setColor(Color.decode("#fee0d5"));
        bezierCurve(g2, 190, 164, 238, 168, 215, 248, 160, 201);
        bezierCurve(g2, 190, 164, 175, 159, 157, 197, 160, 201);
        bf = floodfill(bf, 197, 197, Color.decode("#fee0d5"));

        bezierCurve(g2, 288, 258, 325, 221, 373, 288, 327, 303);
        bezierCurve(g2, 288, 258, 296, 259, 323, 291, 327, 303);
        bf = floodfill(bf, 333, 280, Color.decode("#fee0d5"));

        // ear line
        bezierCurve(g2, 306, 109, 307, 102, 316, 94, 319, 96);
        bezierCurve(g2, 306, 109, 321, 116, 331, 107, 319, 96);
        bf = floodfill(bf, 314, 104, Color.decode("#fee0d5"));

        bezierCurve(g2, 463, 175, 525, 192, 528, 112, 467, 152);
        bezierCurve(g2, 398, 161, 391, 147, 419, 146, 467, 152);
        bezierCurve(g2, 463, 175, 411, 161, 401, 174, 398, 161);
        bf = floodfill(bf, 418, 161, Color.decode("#fee0d5"));

        // on cheeks
        g2.setColor(Color.decode("#e8c3b3"));
        bezierCurve(g2, 187, 177, 191, 179, 186, 185, 182, 182);
        bezierCurve(g2, 187, 177, 185, 176, 180, 180, 182, 182);
        bf = floodfill(bf, 185, 179, Color.decode("#e8c3b3"));

        bezierCurve(g2, 192, 182, 190, 181, 184, 185, 188, 188);
        bezierCurve(g2, 192, 182, 195, 184, 192, 191, 188, 188);
        bf = floodfill(bf, 189, 186, Color.decode("#e8c3b3"));

        bezierCurve(g2, 314, 266, 311, 267, 312, 273, 314, 273);
        bezierCurve(g2, 314, 266, 317, 266, 317, 273, 314, 273);
        bf = floodfill(bf, 314, 270, Color.decode("#e8c3b3"));

        bezierCurve(g2, 323, 271, 321, 271, 320, 278, 324, 278);
        bezierCurve(g2, 323, 271, 326, 272, 327, 277, 324, 278);
        bf = floodfill(bf, 323, 274, Color.decode("#e8c3b3"));

        // eyes
        g2.setColor(Color.decode("#6d5249"));
        bezierCurve(g2, 242, 182, 243, 184, 240, 188, 238, 189);
        bezierCurve(g2, 208, 181, 230, 187, 234, 190, 238, 189);
        bezierCurve(g2, 208, 181, 211, 179, 210, 175, 212, 173);
        bezierCurve(g2, 242, 182, 239, 178, 213, 168, 212, 173);
        bf = floodfill(bf, 230, 182, Color.decode("#6d5249"));

        bezierCurve(g2, 296, 216, 308, 225, 320, 236, 330, 251);
        bezierCurve(g2, 330, 251, 327, 254, 326, 256, 319, 258);
        bezierCurve(g2, 319, 256, 312, 252, 302, 238, 288, 224);
        bezierCurve(g2, 296, 216, 291, 220, 293, 217, 288, 224);
        bf = floodfill(bf, 306, 233, Color.decode("#6d5249"));

        // lip
        g2.setColor(Color.decode("#bf805d"));
        bezierCurve(g2, 277, 225, 262, 216, 269, 204, 263, 202);
        bezierCurve(g2, 263, 202, 252, 201, 255, 208, 240, 202);
        bezierCurve(g2, 240, 202, 236, 201, 242, 212, 260, 207);
        bezierCurve(g2, 260, 207, 265, 232, 283, 230, 277, 225);
        bf = floodfill(bf, 259, 205, Color.decode("#bf805d"));

        // cut face line
        g2.setColor(Color.decode("#b69b90"));
        bezierCurve(g2, 157, 229, 159, 233, 163, 229, 161, 227);
        bezierCurve(g2, 157, 229, 156, 223, 160, 225, 161, 227);
        bf = floodfill(bf, 159, 228, Color.decode("#b69b90"));

        bezierCurve(g2, 159, 220, 149, 221, 156, 184, 165, 185);
        bezierCurve(g2, 159, 220, 162, 218, 160, 201, 160, 198);
        bezierCurve(g2, 165, 185, 169, 185, 161, 194, 160, 198);
        bf = floodfill(bf, 162, 189, Color.decode("#b69b90"));

        bezierCurve(g2, 172, 178, 172, 178, 169, 173, 167, 176);
        bezierCurve(g2, 172, 178, 166, 184, 164, 178, 167, 176);
        bf = floodfill(bf, 168, 179, Color.decode("#b69b90"));

        bezierCurve(g2, 173, 168, 175, 167, 175, 174, 174, 174);
        bezierCurve(g2, 173, 168, 168, 169, 168, 174, 174, 174);
        bf = floodfill(bf, 172, 171, Color.decode("#b69b90"));

        bezierCurve(g2, 176, 169, 180, 174, 190, 160, 190, 160);
        bezierCurve(g2, 176, 169, 172, 161, 190, 160, 190, 160);
        bf = floodfill(bf, 181, 164, Color.decode("#b69b90"));

        bezierCurve(g2, 192, 156, 202, 159, 201, 137, 213, 133);
        bezierCurve(g2, 192, 156, 187, 153, 212, 121, 213, 133);
        bf = floodfill(bf, 202, 140, Color.decode("#b69b90"));

        bezierCurve(g2, 263, 140, 263, 149, 284, 136, 290, 121);
        bezierCurve(g2, 317, 94, 307, 102, 301, 115, 290, 121);
        bezierCurve(g2, 317, 94, 311, 89, 294, 112, 288, 114);
        bezierCurve(g2, 288, 114, 272, 143, 265, 129, 263, 140);
        bf = floodfill(bf, 280, 131, Color.decode("#b69b90"));

        bezierCurve(g2, 258, 139, 265, 147, 237, 155, 239, 145);
        bezierCurve(g2, 258, 139, 254, 137, 250, 143, 248, 144);
        bezierCurve(g2, 238, 145, 239, 142, 245, 144, 248, 144);
        bf = floodfill(bf, 254, 144, Color.decode("#b69b90"));

        bezierCurve(g2, 232, 145, 235, 142, 232, 136, 228, 140);
        bezierCurve(g2, 232, 145, 230, 147, 224, 143, 228, 140);
        bf = floodfill(bf, 230, 143, Color.decode("#b69b90"));

        bezierCurve(g2, 215, 121, 217, 136, 233, 133, 225, 138);
        bezierCurve(g2, 215, 121, 215, 107, 227, 94, 222, 93);
        bezierCurve(g2, 225, 138, 204, 144, 205, 96, 222, 93);
        bf = floodfill(bf, 215, 128, Color.decode("#b69b90"));

        bezierCurve(g2, 224, 89, 229, 93, 241, 85, 242, 79);
        bezierCurve(g2, 267, 71, 260, 75, 252, 69, 242, 79);
        bezierCurve(g2, 267, 71, 282, 58, 296, 69, 296, 61);
        bezierCurve(g2, 265, 64, 280, 54, 295, 60, 296, 61);
        bezierCurve(g2, 265, 64, 254, 67, 243, 62, 233, 80);
        bezierCurve(g2, 224, 89, 222, 82, 229, 81, 233, 80);
        bf = floodfill(bf, 256, 70, Color.decode("#b69b90"));

        bezierCurve(g2, 297, 65, 301, 66, 300, 58, 296, 59);
        bezierCurve(g2, 297, 65, 293, 65, 296, 59, 296, 59);
        bf = floodfill(bf, 298, 63, Color.decode("#b69b90"));

        bezierCurve(g2, 314, 68, 308, 71, 303, 68, 303, 63);
        bezierCurve(g2, 314, 68, 315, 65, 305, 60, 303, 63);
        bf = floodfill(bf, 307, 66, Color.decode("#b69b90"));

        bezierCurve(g2, 315, 69, 319, 67, 323, 71, 325, 73);
        bezierCurve(g2, 361, 112, 365, 99, 330, 65, 325, 73);
        bezierCurve(g2, 361, 112, 370, 115, 386, 133, 386, 133);
        bezierCurve(g2, 437, 126, 437, 122, 413, 118, 386, 133);
        bezierCurve(g2, 437, 126, 434, 133, 416, 121, 385, 138);
        bezierCurve(g2, 355, 110, 366, 119, 381, 138, 385, 138);
        bezierCurve(g2, 355, 110, 354, 92, 335, 81, 324, 75);
        bezierCurve(g2, 315, 69, 314, 73, 318, 78, 324, 75);
        bf = floodfill(bf, 342, 85, Color.decode("#b69b90"));

        bezierCurve(g2, 449, 125, 464, 134, 464, 127, 464, 127);
        bezierCurve(g2, 449, 125, 467, 123, 464, 127, 464, 127);
        bf = floodfill(bf, 459, 126, Color.decode("#b69b90"));

        bezierCurve(g2, 467, 128, 469, 134, 481, 134, 483, 128);
        bezierCurve(g2, 467, 128, 467, 128, 483, 128, 483, 128);
        bf = floodfill(bf, 474, 130, Color.decode("#b69b90"));

        bezierCurve(g2, 474, 126, 476, 133, 490, 111, 512, 110);
        bezierCurve(g2, 538, 112, 535, 118, 528, 108, 512, 110);
        bezierCurve(g2, 538, 112, 536, 105, 505, 92, 474, 126);
        bf = floodfill(bf, 503, 108, Color.decode("#b69b90"));

        bezierCurve(g2, 546, 119, 546, 113, 540, 115, 540, 115);
        bezierCurve(g2, 546, 119, 536, 122, 540, 115, 540, 115);
        bf = floodfill(bf, 542, 117, Color.decode("#b69b90"));

        bezierCurve(g2, 548, 123, 544, 126, 562, 134, 557, 159);
        bezierCurve(g2, 485, 201, 511, 214, 544, 197, 557, 159);
        bezierCurve(g2, 485, 201, 437, 202, 420, 186, 419, 192);
        bezierCurve(g2, 474, 205, 443, 209, 418, 197, 419, 192);
        bezierCurve(g2, 474, 205, 525, 223, 562, 186, 563, 153);
        bezierCurve(g2, 548, 123, 560, 125, 562, 137, 563, 153);
        bf = floodfill(bf, 558, 165, Color.decode("#b69b90"));

        bezierCurve(g2, 422, 196, 418, 196, 420, 229, 419, 232);
        bezierCurve(g2, 407, 272, 408, 260, 419, 239, 419, 232);
        bezierCurve(g2, 407, 272, 422, 278, 431, 203, 422, 196);
        bf = floodfill(bf, 414, 260, Color.decode("#b69b90"));

        bezierCurve(g2, 403, 277, 417, 285, 360, 352, 330, 329);
        bezierCurve(g2, 369, 319, 346, 334, 337, 321, 330, 329);
        bezierCurve(g2, 403, 277, 397, 278, 388, 306, 369, 319);
        bf = floodfill(bf, 394, 296, Color.decode("#b69b90"));

        // cut body line
        bezierCurve(g2, 84, 340, 90, 334, 96, 329, 93, 328);
        bezierCurve(g2, 79, 336, 84, 339, 89, 326, 93, 328);
        bezierCurve(g2, 79, 336, 68, 324, 53, 318, 39, 334);
        bezierCurve(g2, 39, 334, 28, 338, 24, 345, 23, 352);
        bezierCurve(g2, 28, 354, 28, 360, 13, 372, 23, 352);
        bezierCurve(g2, 28, 354, 28, 342, 42, 338, 42, 338);
        bezierCurve(g2, 79, 339, 64, 344, 66, 317, 42, 338);
        bezierCurve(g2, 79, 339, 86, 357, 87, 344, 84, 340);
        bf = floodfill(bf, 68, 334, Color.decode("#b69b90"));

        bezierCurve(g2, 20, 368, 23, 368, 24, 372, 20, 371);
        bezierCurve(g2, 20, 368, 16, 367, 15, 371, 20, 371);
        bf = floodfill(bf, 19, 369, Color.decode("#b69b90"));

        bezierCurve(g2, 27, 386, 22, 378, 18, 369, 21, 386);
        bezierCurve(g2, 46, 424, 44, 423, 19, 404, 21, 386);
        bezierCurve(g2, 46, 424, 52, 417, 28, 413, 27, 386);
        bf = floodfill(bf, 26, 397, Color.decode("#b69b90"));

        bezierCurve(g2, 52, 425, 85, 436, 116, 415, 118, 419);
        bezierCurve(g2, 141, 427, 156, 429, 152, 447, 118, 419);
        bezierCurve(g2, 141, 427, 108, 400, 115, 420, 91, 421);
        bezierCurve(g2, 52, 424, 51, 420, 60, 423, 91, 421);
        bf = floodfill(bf, 114, 417, Color.decode("#b69b90"));

        bezierCurve(g2, 81, 399, 85, 405, 91, 384, 85, 384);
        bezierCurve(g2, 83, 391, 84, 387, 81, 383, 85, 384);
        bezierCurve(g2, 83, 391, 82, 395, 77, 396, 81, 399);
        bf = floodfill(bf, 84, 391, Color.decode("#b69b90"));

        bezierCurve(g2, 86, 381, 83, 382, 80, 378, 83, 376);
        bezierCurve(g2, 86, 381, 88, 381, 87, 376, 83, 376);
        bf = floodfill(bf, 84, 379, Color.decode("#b69b90"));

        bezierCurve(g2, 83, 374, 87, 373, 88, 356, 74, 350);
        bezierCurve(g2, 52, 339, 60, 335, 67, 340, 74, 350);
        bezierCurve(g2, 52, 339, 52, 341, 61, 341, 61, 344);
        bezierCurve(g2, 78, 360, 71, 356, 66, 353, 61, 344);
        bezierCurve(g2, 78, 360, 82, 367, 77, 375, 83, 374);
        bf = floodfill(bf, 80, 360, Color.decode("#b69b90"));

        bezierCurve(g2, 156, 418, 159, 421, 152, 427, 152, 435);
        bezierCurve(g2, 156, 418, 152, 416, 149, 433, 143, 438);
        bezierCurve(g2, 136, 457, 134, 445, 141, 448, 143, 438);
        bezierCurve(g2, 136, 457, 129, 463, 120, 478, 126, 491);
        bezierCurve(g2, 143, 459, 128, 469, 132, 491, 126, 491);
        bezierCurve(g2, 143, 459, 142, 446, 145, 440, 152, 435);
        bf = floodfill(bf, 138, 460, Color.decode("#b69b90"));

        bezierCurve(g2, 126, 495, 129, 494, 131, 500, 128, 501);
        bezierCurve(g2, 126, 495, 123, 498, 124, 502, 128, 501);
        bf = floodfill(bf, 127, 498, Color.decode("#b69b90"));

        bezierCurve(g2, 147, 527, 162, 528, 174, 535, 174, 535);
        bezierCurve(g2, 193, 537, 193, 537, 174, 535, 174, 535);
        bezierCurve(g2, 193, 537, 193, 537, 199, 530, 204, 530);
        bezierCurve(g2, 225, 507, 223, 510, 208, 521, 204, 530);
        bezierCurve(g2, 225, 507, 226, 505, 231, 494, 230, 487);
        bezierCurve(g2, 234, 498, 236, 497, 247, 444, 230, 487);
        bezierCurve(g2, 234, 498, 212, 550, 186, 544, 178, 542);
        bezierCurve(g2, 178, 542, 164, 540, 154, 538, 143, 531);
        bezierCurve(g2, 147, 527, 127, 499, 133, 522, 143, 531);
        bf = floodfill(bf, 219, 516, Color.decode("#b69b90"));

        bezierCurve(g2, 259, 434, 264, 425, 277, 416, 263, 437);
        bezierCurve(g2, 259, 434, 249, 441, 251, 456, 263, 437);
        bf = floodfill(bf, 263, 431, Color.decode("#b69b90"));

        bezierCurve(g2, 319, 409, 296, 396, 318, 394, 323, 408);
        bezierCurve(g2, 319, 409, 333, 424, 344, 412, 323, 408);
        bf = floodfill(bf, 326, 411, Color.decode("#b69b90"));

        bezierCurve(g2, 337, 421, 339, 419, 352, 422, 351, 426);
        bezierCurve(g2, 337, 421, 334, 424, 349, 431, 351, 426);
        bf = floodfill(bf, 344, 424, Color.decode("#b69b90"));

        bezierCurve(g2, 358, 422, 360, 421, 363, 427, 360, 429);
        bezierCurve(g2, 358, 422, 354, 424, 355, 432, 360, 429);
        bf = floodfill(bf, 358, 426, Color.decode("#b69b90"));

        bezierCurve(g2, 364, 429, 364, 425, 375, 429, 395, 418);
        bezierCurve(g2, 400, 393, 399, 399, 403, 408, 395, 418);
        bezierCurve(g2, 400, 393, 396, 387, 402, 385, 394, 377);
        bezierCurve(g2, 394, 372, 391, 364, 380, 367, 394, 377);
        bezierCurve(g2, 394, 372, 409, 380, 403, 389, 403, 391);
        bezierCurve(g2, 404, 402, 402, 401, 406, 393, 403, 391);
        bezierCurve(g2, 404, 402, 409, 408, 398, 421, 394, 425);
        bezierCurve(g2, 364, 429, 362, 436, 371, 433, 394, 425);
        bf = floodfill(bf, 379, 426, Color.decode("#b69b90"));

        bezierCurve(g2, 375, 353, 397, 365, 377, 376, 366, 352);
        bezierCurve(g2, 375, 353, 371, 340, 307, 312, 366, 352);
        bf = floodfill(bf, 371, 355, Color.decode("#b69b90"));

        // hat line
        g2.setColor(Color.decode("#f5d07f"));
        bezierCurve(g2, 118, 265, 127, 236, 183, 218, 203, 227);
        bezierCurve(g2, 203, 227, 239, 210, 268, 239, 280, 255);
        bezierCurve(g2, 280, 255, 332, 269, 391, 423, 237, 426);
        bezierCurve(g2, 237, 426, 164, 420, 118, 366, 110, 328);
        bezierCurve(g2, 110, 328, 140, 305, 131, 283, 118, 265);
        bf = floodfill(bf, 142, 251, Color.decode("#f5d07f"));

        // bow
        g2.setColor(Color.decode("#fdbaaa"));
        bezierCurve(g2, 160, 279, 167, 292, 189, 317, 207, 325);
        bezierCurve(g2, 207, 325, 209, 311, 230, 301, 262, 347);
        bresenhamsLine(g2, 262, 347, 276, 347);
        bezierCurve(g2, 276, 347, 313, 316, 319, 329, 309, 350);
        bezierCurve(g2, 309, 350, 309, 396, 294, 378, 278, 368);
        bezierCurve(g2, 287, 373, 229, 375, 167, 328, 153, 290);

        bresenhamsLine(g2, 160, 279, 153, 290);
        // bf = floodfill(bf, 171, 310, Color.decode("#fdbaaa"));

        // cut right hand line
        g2.setColor(Color.decode("#b69b90"));
        bezierCurve(g2, 107, 326, 110, 323, 114, 328, 111, 330);
        bezierCurve(g2, 107, 326, 105, 330, 108, 334, 111, 330);
        bf = floodfill(bf, 109, 328, Color.decode("#b69b90"));

        bezierCurve(g2, 118, 321, 122, 322, 119, 328, 117, 328);
        bezierCurve(g2, 118, 321, 112, 321, 114, 329, 117, 328);
        bf = floodfill(bf, 116, 325, Color.decode("#b69b90"));

        bezierCurve(g2, 121, 317, 126, 328, 142, 298, 131, 287);
        bezierCurve(g2, 131, 287, 133, 282, 130, 273, 126, 272);
        bezierCurve(g2, 126, 287, 129, 275, 120, 274, 126, 272);
        bezierCurve(g2, 126, 287, 133, 313, 119, 312, 121, 317);
        bf = floodfill(bf, 129, 296, Color.decode("#b69b90"));

        bezierCurve(g2, 123, 270, 120, 278, 119, 258, 103, 278);
        bezierCurve(g2, 87, 312, 93, 312, 81, 283, 103, 278);
        bezierCurve(g2, 87, 312, 80, 313, 80, 279, 96, 276);
        bezierCurve(g2, 96, 276, 116, 255, 124, 271, 123, 270);
        bf = floodfill(bf, 84, 294, Color.decode("#b69b90"));

        bezierCurve(g2, 96, 322, 108, 326, 102, 338, 94, 327);
        bezierCurve(g2, 96, 322, 83, 308, 83, 326, 94, 327);
        bf = floodfill(bf, 93, 323, Color.decode("#b69b90"));

        // grass
        grass(g2, bf, 0, 0);
        grass(g2, bf, -20, 322);
        // flower
        flower(g2, bf, 0, 0, Color.decode("#f2dfd0"));
        flower(g2, bf, -51, -54, Color.decode("#f2dfd0"));
        flower(g2, bf, 30, -20, Color.decode("#f2dfd0"));
        // flower(g2, bf, -103, -346, Color.decode("#fbe6eb")); now bug

        g.drawImage(bf, 0, 0, null);

    }

    public void flower(Graphics g, BufferedImage bf, int x, int y, Color c) {
        g.setColor(c);
        bezierCurve(g, 60 + x, 488 + y, 55 + x, 478 + y, 37 + x, 492 + y, 57 + x, 495 + y);
        bezierCurve(g, 65 + x, 502 + y, 63 + x, 510 + y, 47 + x, 508 + y, 57 + x, 495 + y);
        bezierCurve(g, 65 + x, 502 + y, 71 + x, 506 + y, 77 + x, 496 + y, 67 + x, 492 + y);
        bezierCurve(g, 60 + x, 488 + y, 62 + x, 475 + y, 75 + x, 487 + y, 67 + x, 492 + y);
        bf = floodfill(bf, 53 + x, 490 + y, c);
        g.setColor(Color.decode("#f8d571"));
        bezierCurve(g, 64 + x, 499 + y, 70 + x, 496 + y, 64 + x, 487 + y, 60 + x, 490 + y);
        bezierCurve(g, 64 + x, 499 + y, 59 + x, 501 + y, 55 + x, 494 + y, 60 + x, 490 + y);
        bf = floodfill(bf, 62 + x, 494 + y, Color.decode("#f8d571"));

    }

    public void grass(Graphics g, BufferedImage bf, int x, int y) {
        g.setColor(Color.decode("#869d45"));
        bezierCurve(g, 89 + x, 207 + y, 87 + x, 199 + y, 91 + x, 182 + y, 99 + x, 174 + y);
        bezierCurve(g, 99 + x, 174 + y, 103 + x, 173 + y, 92 + x, 210 + y, 89 + x, 207 + y);
        bf = floodfill(bf, 92 + x, 190 + y, Color.decode("#869d45"));
        bezierCurve(g, 85 + x, 186 + y, 79 + x, 191 + y, 76 + x, 201 + y, 80 + x, 208 + y);
        bezierCurve(g, 80 + x, 208 + y, 83 + x, 210 + y, 88 + x, 185 + y, 85 + x, 186 + y);
        bf = floodfill(bf, 82 + x, 196 + y, Color.decode("#869d45"));
        bezierCurve(g, 65 + x, 185 + y, 77 + x, 204 + y, 74 + x, 226 + y, 70 + x, 230 + y);
        bezierCurve(g, 70 + x, 230 + y, 65 + x, 232 + y, 64 + x, 187 + y, 65 + x, 185 + y);
        bf = floodfill(bf, 71 + x, 209 + y, Color.decode("#869d45"));
    }

    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i < 1000; i++) {
            double t = i / 1000.0;
            int x = (int) (Math.pow((1 - t), 3) * x1 +
                    3 * t * Math.pow((1 - t), 2) * x2 +
                    3 * Math.pow(t, 2) * (1 - t) * x3
                    + Math.pow(t, 3) * x4);
            int y = (int) (Math.pow((1 - t), 3) * y1
                    + 3 * t * Math.pow((1 - t), 2) * y2
                    + 3 * Math.pow(t, 2) * (1 - t) * y3
                    + Math.pow(t, 3) * y4);

            plot(g, x, y, 1);
        }
    }

    public BufferedImage floodfill(BufferedImage m, int x, int y, Color replacementColor) {
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        g2.setColor(replacementColor);
        plot(g2, x, y, 1);
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            Point p = q.poll();
            // south
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) != replacementColor.getRGB()) {
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // north
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) != replacementColor.getRGB()) {
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // east
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) != replacementColor.getRGB()) {
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }
            // west
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) != replacementColor.getRGB()) {
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
        return m;
    }

    public void bresenhamsLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;

        if (dy > dx) {
            int tmp;
            tmp = dx;
            dx = dy;
            dy = tmp;
            isSwap = true;
        }

        int D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g, x, y, 1);
            if (D >= 0) {
                if (isSwap) {
                    x += sx;
                } else {
                    y += sy;
                }

                D -= 2 * dx;
            }
            if (isSwap) {
                y += sy;
            } else {
                x += sx;
            }
            D += 2 * dy;
        }

    }

    // public void MidpointEllipse(Graphics g, int xc, int yc, int a, int b) {
    // int wh = 1;
    // int x, y, d;
    // x = 0;
    // y = b;
    // d = Math.round(b * b - a * a * b + a * a / 4);
    // while (b * b * x <= a * a * y) {
    // plot(g, x + xc, y + yc, wh);
    // plot(g, -x + xc, y + yc, wh);
    // plot(g, x + xc, -y + yc, wh);
    // plot(g, -x + xc, -y + yc, wh);
    // x++;
    // d += 2 * b * b * x + b * b;
    // if (d >= 0) {
    // y--;
    // d -= 2 * a * a * y;
    // }
    // }

    // x = a;
    // y = 0;
    // d = Math.round(a * a - b * b * a + b * b / 4);
    // while (b * b * x >= a * a * y) {
    // plot(g, x + xc, y + yc, wh);
    // plot(g, -x + xc, y + yc, wh);
    // plot(g, x + xc, -y + yc, wh);
    // plot(g, -x + xc, -y + yc, wh);
    // y++;
    // d += 2 * a * a * y + a * a;
    // if (d >= 0) {
    // x--;
    // d -= 2 * b * b * x;
    // }
    // }
    // }

    void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }
}