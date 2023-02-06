import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1_64050285_64050543 extends JPanel {
    int size = 1;

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

        // grass shadow
        g2.setColor(Color.decode("#6f8230"));
        bezierCurve(g2, 194, 546, 196, 546, 215, 540, 229, 527);
        bezierCurve(g2, 229, 527, 263, 498, 238, 460, 274, 446);
        bezierCurve(g2, 274, 446, 292, 438, 316, 442, 321, 449);
        bresenhamsLine(g2, 249, 487, 311, 506);
        bresenhamsLine(g2, 321, 449, 400, 470);
        bezierCurve(g2, 400, 470, 418, 474, 423, 465, 411, 453);
        bezierCurve(g2, 311, 506, 322, 507, 327, 500, 315, 490);
        bezierCurve(g2, 315, 490, 340, 493, 340, 486, 335, 483);
        bresenhamsLine(g2, 258, 459, 335, 483);
        bezierCurve(g2, 411, 453, 422, 450, 420, 446, 412, 447);
        bresenhamsLine(g2, 412, 447, 278, 410);
        bresenhamsLine(g2, 278, 410, 194, 546);
        bf = floodfill(bf, 276, 435, Color.decode("#6f8230"));
        bf = floodfill(bf, 287, 481, Color.decode("#6f8230"));
        bezierCurve(g2, 61, 424, 59, 430, 65, 433, 71, 434);
        bezierCurve(g2, 71, 434, 93, 440, 95, 429, 118, 433);
        bezierCurve(g2, 118, 433, 135, 437, 149, 445, 158, 454);
        bresenhamsLine(g2, 158, 454, 137, 413);
        bresenhamsLine(g2, 137, 413, 61, 424);
        bf = floodfill(bf, 112, 421, Color.decode("#6f8230"));
        bezierCurve(g2, 335, 327, 373, 343, 440, 311, 418, 188);
        bezierCurve(g2, 412, 200, 514, 238, 556, 193, 550, 166);
        bresenhamsLine(g2, 335, 327, 397, 180);
        bresenhamsLine(g2, 397, 180, 550, 166);
        bf = floodfill(bf, 415, 188, Color.decode("#6f8230"));
        grass(g2, bf, 70, 226);
        grass(g2, bf, 3, 390);
        grass(g2, bf, 340, 260);
        grass(g2, bf, 330, 305);

        /* lower face line */
        g2.setColor(Color.WHITE);
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

        // shadow
        // shadow left foot
        g2.setColor(Color.decode("#d3d9cd"));
        bezierCurve(g2, 20, 366, 23, 375, 33, 386, 40, 388);
        bezierCurve(g2, 40, 388, 40, 396, 33, 408, 66, 406);
        bezierCurve(g2, 66, 406, 76, 410, 98, 406, 110, 398);
        bezierCurve(g2, 110, 398, 115, 391, 127, 392, 130, 412);
        bezierCurve(g2, 130, 412, 139, 420, 160, 423, 155, 419);
        bresenhamsLine(g2, 155, 419, 145, 433);
        bresenhamsLine(g2, 145, 433, 115, 419);
        bezierCurve(g2, 20, 366, 17, 403, 52, 442, 115, 419);
        bf = floodfill(bf, 62, 416, Color.decode("#d3d9cd"));
        // shadow ear
        bezierCurve(g2, 557, 174, 552, 194, 498, 227, 420, 188);
        bezierCurve(g2, 518, 187, 471, 197, 425, 186, 420, 188);
        bezierCurve(g2, 557, 174, 553, 166, 538, 182, 518, 187);
        bf = floodfill(bf, 505, 199, Color.decode("#d3d9cd"));
        // shadow face
        bezierCurve(g2, 420, 188, 412, 286, 349, 318, 322, 319);
        bezierCurve(g2, 420, 188, 438, 274, 375, 332, 336, 329);
        bresenhamsLine(g2, 322, 319, 336, 329);
        bf = floodfill(bf, 374, 307, Color.decode("#d3d9cd"));
        // shadow hand
        bezierCurve(g2, 398, 383, 389, 414, 346, 431, 302, 362);
        bezierCurve(g2, 398, 418, 351, 458, 331, 407, 290, 384);
        bresenhamsLine(g2, 398, 383, 398, 418);
        bresenhamsLine(g2, 302, 362, 290, 384);
        bf = floodfill(bf, 380, 422, Color.decode("#d3d9cd"));
        // shadow right foot
        bezierCurve(g2, 130, 486, 154, 521, 200, 518, 220, 486);
        bezierCurve(g2, 220, 486, 213, 474, 219, 460, 230, 457);
        bezierCurve(g2, 230, 457, 233, 452, 230, 450, 232, 445);
        bresenhamsLine(g2, 232, 445, 256, 409);
        bresenhamsLine(g2, 256, 409, 273, 414);
        bresenhamsLine(g2, 273, 414, 234, 484);
        bezierCurve(g2, 234, 484, 224, 538, 171, 554, 131, 517);
        bezierCurve(g2, 130, 486, 125, 496, 126, 506, 131, 517);
        bf = floodfill(bf, 184, 522, Color.decode("#d3d9cd"));

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

        // on left cheeks
        g2.setColor(Color.decode("#e8c3b3"));
        bezierCurve(g2, 187, 177, 191, 179, 186, 185, 182, 182);
        bezierCurve(g2, 187, 177, 185, 176, 180, 180, 182, 182);
        bf = floodfill(bf, 185, 179, Color.decode("#e8c3b3"));

        bezierCurve(g2, 192, 182, 190, 181, 184, 185, 188, 188);
        bezierCurve(g2, 192, 182, 195, 184, 192, 191, 188, 188);
        bf = floodfill(bf, 189, 186, Color.decode("#e8c3b3"));

        // on right cheeks
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

        bezierCurve(g2, 422, 196, 418, 196, 420, 229, 419, 232);
        bezierCurve(g2, 407, 272, 408, 260, 419, 239, 419, 232);
        bezierCurve(g2, 407, 272, 422, 278, 431, 203, 422, 196);
        bf = floodfill(bf, 414, 260, Color.decode("#b69b90"));

        bezierCurve(g2, 403, 277, 417, 285, 360, 352, 330, 329);
        bezierCurve(g2, 369, 319, 346, 334, 337, 321, 330, 329);
        bezierCurve(g2, 403, 277, 397, 278, 388, 306, 369, 319);
        bf = floodfill(bf, 394, 296, Color.decode("#b69b90"));

        // cut left ear
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

        // cut right ear
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

        // cut left foot line
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

        // cut right foot
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

        bezierCurve(g2, 222, 496, 215, 499, 220, 480, 222, 480);
        bezierCurve(g2, 222, 496, 228, 494, 225, 480, 222, 480);
        bf = floodfill(bf, 220, 489, Color.decode("#b69b90"));

        bezierCurve(g2, 222, 469, 231, 474, 216, 487, 218, 473);
        bezierCurve(g2, 222, 469, 222, 461, 210, 465, 218, 473);
        bf = floodfill(bf, 220, 470, Color.decode("#b69b90"));

        bezierCurve(g2, 216, 463, 222, 462, 215, 447, 206, 445);
        bezierCurve(g2, 177, 438, 188, 433, 198, 438, 206, 445);
        bezierCurve(g2, 177, 438, 163, 432, 151, 448, 152, 449);
        bezierCurve(g2, 176, 443, 161, 436, 155, 451, 152, 449);
        bezierCurve(g2, 176, 443, 181, 447, 183, 433, 201, 451);
        bezierCurve(g2, 216, 463, 204, 463, 217, 455, 201, 451);
        bf = floodfill(bf, 199, 445, Color.decode("#b69b90"));

        bezierCurve(g2, 259, 434, 264, 425, 277, 416, 263, 437);
        bezierCurve(g2, 259, 434, 249, 441, 251, 456, 263, 437);
        bf = floodfill(bf, 263, 431, Color.decode("#b69b90"));

        // cut right hand
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

        // hat
        g2.setColor(Color.decode("#f5d07f"));
        bezierCurve(g2, 118, 265, 127, 236, 183, 218, 203, 227);
        bezierCurve(g2, 203, 227, 239, 210, 268, 239, 280, 255);
        bezierCurve(g2, 280, 255, 332, 269, 391, 423, 237, 426);
        bezierCurve(g2, 237, 426, 164, 420, 118, 366, 110, 328);
        bezierCurve(g2, 110, 328, 140, 305, 131, 283, 118, 265);
        bf = floodfill(bf, 142, 251, Color.decode("#f5d07f"));

        // hat line
        g2.setColor(Color.decode("#dfb054"));
        bezierCurve(g2, 201, 228, 197, 217, 139, 225, 112, 269);
        bezierCurve(g2, 201, 228, 172, 217, 118, 255, 116, 268);
        bresenhamsLine(g2, 116, 268, 112, 269);
        bf = floodfill(bf, 149, 236, Color.decode("#dfb054"));

        bezierCurve(g2, 105, 329, 104, 338, 142, 398, 186, 415);
        bezierCurve(g2, 319, 396, 321, 399, 288, 452, 186, 415);
        bezierCurve(g2, 319, 396, 317, 395, 275, 446, 188, 409);
        bezierCurve(g2, 111, 330, 111, 338, 141, 388, 188, 409);
        bresenhamsLine(g2, 105, 329, 111, 330);
        bf = floodfill(bf, 173, 406, Color.decode("#dfb054"));

        bezierCurve(g2, 324, 385, 326, 378, 329, 381, 327, 387);
        bezierCurve(g2, 324, 385, 318, 393, 320, 397, 327, 387);
        bf = floodfill(bf, 324, 388, Color.decode("#dfb054"));

        bresenhamsLine(g2, 278, 255, 277, 252);
        bezierCurve(g2, 278, 255, 281, 254, 320, 288, 328, 318);
        bezierCurve(g2, 328, 377, 325, 372, 339, 358, 328, 318);
        bezierCurve(g2, 328, 377, 353, 345, 327, 277, 277, 252);
        bf = floodfill(bf, 335, 337, Color.decode("#dfb054"));

        size = 4;
        bezierCurve(g2, 152, 289, 161, 266, 214, 170, 282, 261);
        bezierCurve(g2, 306, 325, 308, 316, 308, 279, 282, 261);
        bezierCurve(g2, 256, 255, 228, 228, 257, 273, 277, 266);
        size = 1;

        // cut left hand line
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
        grass(g2, bf, 0, 184);
        grass(g2, bf, 0, 506);
        grass(g2, bf, 116, 79);
        grass(g2, bf, 453, 507);
        grass(g2, bf, 504, 328);
        grass(g2, bf, 437, 50);
        grass(g2, bf, 18, 46);
        grass(g2, bf, 149, 510);
        grass(g2, bf, 422, 186);
        grass(g2, bf, 310, 444);
        grass(g2, bf, 50, 406);
        grass(g2, bf, 330, 398);
        grass(g2, bf, 463, 411);

        // flower
        flower(g2, bf, 0, 16, Color.decode("#f2dfd0"));
        flower(g2, bf, 99, 58, Color.decode("#f8cdc6"));
        flower(g2, bf, 157, 32, Color.decode("#f8e6e6"));
        flower(g2, bf, 444, 30, Color.decode("#f6dfd7"));
        flower(g2, bf, 470, 50, Color.decode("#f6dfd7"));
        flower(g2, bf, 406, 58, Color.decode("#f8cdc6"));
        flower(g2, bf, 532, 21, Color.decode("#f8cdc6"));
        flower(g2, bf, 509, 296, Color.decode("#f6dfd7"));
        flower(g2, bf, 487, 319, Color.decode("#f8cdc6"));
        flower(g2, bf, 474, 470, Color.decode("#f8e6e6"));
        flower(g2, bf, 502, 490, Color.decode("#f8e6e6"));
        flower(g2, bf, 419, 495, Color.decode("#f8cdc6"));
        flower(g2, bf, 86, 441, Color.decode("#f8e6e6"));
        flower(g2, bf, 62, 493, Color.decode("#f8e6e6"));
        flower(g2, bf, 23, 496, Color.decode("#f2dfd0"));
        flower(g2, bf, 141, 126, Color.decode("#f8e6e6"));
        flower(g2, bf, 50, 148, Color.decode("#f8cdc6"));
        flower(g2, bf, 20, 163, Color.decode("#f6dfd7"));

        // top bow color
        g2.setColor(Color.decode("#fdbaaa"));
        bezierCurve(g2, 161, 275, 164, 289, 186, 315, 202, 325);
        bezierCurve(g2, 208, 321, 208, 321, 207, 326, 202, 325);
        bezierCurve(g2, 208, 321, 208, 321, 208, 274, 262, 347);
        bezierCurve(g2, 274, 350, 276, 346, 266, 342, 262, 347);
        bezierCurve(g2, 274, 350, 303, 313, 338, 314, 310, 341);
        bezierCurve(g2, 285, 372, 295, 372, 310, 384, 310, 341);
        bezierCurve(g2, 285, 372, 282, 369, 309, 400, 307, 415);

        bresenhamsLine(g2, 291, 421, 270, 373);
        bresenhamsLine(g2, 257, 372, 270, 373);
        bezierCurve(g2, 257, 372, 257, 372, 257, 408, 245, 423);

        bezierCurve(g2, 226, 423, 226, 423, 246, 456, 238, 472);
        bresenhamsLine(g2, 226, 423, 249, 369);
        bezierCurve(g2, 249, 369, 249, 369, 164, 350, 153, 291);
        bezierCurve(g2, 161, 275, 158, 276, 151, 288, 153, 291);
        bresenhamsLine(g2, 307, 415, 291, 421);
        bresenhamsLine(g2, 245, 423, 238, 472);
        bf = floodfill(bf, 182, 321, Color.decode("#fdbaaa"));

        // bottm bow color
        g2.setColor(Color.decode("#f8a99a"));
        bezierCurve(g2, 342, 431, 342, 431, 319, 419, 307, 415);
        bezierCurve(g2, 342, 431, 342, 431, 399, 438, 408, 446);
        bezierCurve(g2, 402, 454, 402, 450, 412, 449, 408, 446);
        bezierCurve(g2, 402, 454, 401, 457, 412, 460, 412, 465);
        bezierCurve(g2, 334, 445, 349, 444, 441, 468, 412, 465);
        bezierCurve(g2, 334, 445, 321, 445, 291, 421, 291, 421);
        bezierCurve(g2, 258, 448, 256, 435, 251, 431, 245, 423);
        bezierCurve(g2, 258, 448, 265, 450, 277, 460, 277, 460);
        bezierCurve(g2, 333, 478, 329, 467, 277, 460, 277, 460);
        bezierCurve(g2, 333, 478, 334, 485, 315, 480, 313, 482);
        bezierCurve(g2, 316, 496, 320, 492, 308, 487, 313, 482);
        bezierCurve(g2, 316, 496, 308, 504, 301, 490, 258, 481);
        bresenhamsLine(g2, 258, 481, 238, 472);
        bresenhamsLine(g2, 307, 415, 291, 421);
        bresenhamsLine(g2, 245, 423, 238, 472);
        bf = floodfill(bf, 261, 464, Color.decode("#f8a99a"));
        bf = floodfill(bf, 320, 430, Color.decode("#f8a99a"));

        // cut bow line
        size = 4;
        g2.setColor(Color.decode("#eda28f"));
        bezierCurve(g2, 161, 275, 164, 289, 186, 315, 202, 325);
        bezierCurve(g2, 208, 321, 208, 321, 207, 326, 202, 325);
        bezierCurve(g2, 208, 321, 208, 321, 208, 274, 262, 347);
        bezierCurve(g2, 274, 350, 276, 346, 266, 342, 262, 347);
        bezierCurve(g2, 274, 350, 303, 313, 338, 314, 310, 341);
        bezierCurve(g2, 285, 372, 295, 372, 310, 384, 310, 341);
        bezierCurve(g2, 285, 372, 282, 369, 309, 400, 307, 415);
        bezierCurve(g2, 342, 431, 342, 431, 319, 419, 307, 415);
        bezierCurve(g2, 342, 431, 342, 431, 399, 438, 408, 446);
        bezierCurve(g2, 402, 454, 402, 450, 412, 449, 408, 446);
        bezierCurve(g2, 402, 454, 401, 457, 412, 460, 412, 465);
        bezierCurve(g2, 334, 445, 349, 444, 441, 468, 412, 465);
        bezierCurve(g2, 334, 445, 321, 445, 291, 421, 291, 421);
        bresenhamsLine(g2, 291, 421, 270, 373);
        bresenhamsLine(g2, 257, 372, 270, 373);
        bezierCurve(g2, 257, 372, 257, 372, 257, 408, 245, 423);
        bezierCurve(g2, 258, 448, 256, 435, 251, 431, 245, 423);
        bezierCurve(g2, 258, 448, 265, 450, 277, 460, 277, 460);
        bezierCurve(g2, 333, 478, 329, 467, 277, 460, 277, 460);
        bezierCurve(g2, 333, 478, 334, 485, 315, 480, 313, 482);
        bezierCurve(g2, 316, 496, 320, 492, 308, 487, 313, 482);
        bezierCurve(g2, 316, 496, 308, 504, 301, 490, 258, 481);
        bresenhamsLine(g2, 258, 481, 238, 472);
        bezierCurve(g2, 226, 423, 226, 423, 246, 456, 238, 472);
        bresenhamsLine(g2, 226, 423, 249, 369);
        bezierCurve(g2, 249, 369, 249, 369, 164, 350, 153, 291);
        bezierCurve(g2, 161, 275, 158, 276, 151, 288, 153, 291);
        bezierCurve(g2, 206, 325, 173, 357, 226, 347, 257, 365);
        bezierCurve(g2, 208, 344, 187, 332, 247, 344, 256, 358);
        bezierCurve(g2, 229, 330, 238, 324, 255, 346, 255, 346);
        bezierCurve(g2, 263, 347, 246, 382, 275, 373, 274, 349);
        bezierCurve(g2, 277, 356, 299, 330, 307, 343, 299, 348);
        bezierCurve(g2, 275, 364, 289, 355, 299, 360, 300, 363);
        bezierCurve(g2, 268, 366, 272, 370, 285, 371, 285, 371);

        size = 1;

        g.drawImage(bf, 0, 0, null);

    }

    public void flower(Graphics g, BufferedImage bf, int x, int y, Color c) {
        g.setColor(c);
        bezierCurve(g, 23 + x, 13 + y, 18 + x, 3 + y, 0 + x, 17 + y, 20 + x, 20 + y);
        bezierCurve(g, 28 + x, 27 + y, 26 + x, 35 + y, 10 + x, 33 + y, 20 + x, 20 + y);
        bezierCurve(g, 28 + x, 27 + y, 34 + x, 31 + y, 40 + x, 21 + y, 30 + x, 17 + y);
        bezierCurve(g, 23 + x, 13 + y, 25 + x, 0 + y, 38 + x, 10 + y, 30 + x, 17 + y);
        bf = floodfill(bf, 16 + x, 15 + y, c);
        g.setColor(Color.decode("#f8d571"));
        bezierCurve(g, 27 + x, 24 + y, 33 + x, 21 + y, 27 + x, 12 + y, 23 + x, 15 + y);
        bezierCurve(g, 27 + x, 24 + y, 22 + x, 26 + y, 18 + x, 19 + y, 23 + x, 15 + y);
        bf = floodfill(bf, 25 + x, 19 + y, Color.decode("#f8d571"));

    }

    public void grass(Graphics g, BufferedImage bf, int x, int y) {
        g.setColor(Color.decode("#869d45"));
        bezierCurve(g, 80 + x, 34 + y, 78 + x, 26 + y, 82 + x, 9 + y, 90 + x, 1 + y);
        bezierCurve(g, 90 + x, 1 + y, 94 + x, 0 + y, 83 + x, 37 + y, 80 + x, 34 + y);
        bf = floodfill(bf, 83 + x, 17 + y, Color.decode("#869d45"));
        bezierCurve(g, 76 + x, 13 + y, 70 + x, 18 + y, 67 + x, 28 + y, 71 + x, 35 + y);
        bezierCurve(g, 71 + x, 35 + y, 74 + x, 37 + y, 79 + x, 12 + y, 76 + x, 13 + y);
        bf = floodfill(bf, 73 + x, 23 + y, Color.decode("#869d45"));
        bezierCurve(g, 56 + x, 12 + y, 68 + x, 31 + y, 65 + x, 53 + y, 61 + x, 57 + y);
        bezierCurve(g, 61 + x, 57 + y, 56 + x, 59 + y, 55 + x, 14 + y, 56 + x, 12 + y);
        bf = floodfill(bf, 62 + x, 36 + y, Color.decode("#869d45"));
        bezierCurve(g, 24 + x, 12 + y, 40 + x, 30 + y, 41 + x, 50 + y, 39 + x, 53 + y);
        bezierCurve(g, 24 + x, 12 + y, 23 + x, 11 + y, 31 + x, 48 + y, 39 + x, 53 + y);
        bf = floodfill(bf, 33 + x, 32 + y, Color.decode("#869d45"));
        bezierCurve(g, 24 + x, 12 + y, 62 + x, 62 + y, 54 + x, 63 + y, 38 + x, 45 + y);
        bf = floodfill(bf, 47 + x, 49 + y, Color.decode("#869d45"));
        bezierCurve(g, 12 + x, 30 + y, 24 + x, 27 + y, 31 + x, 37 + y, 30 + x, 43 + y);
        bezierCurve(g, 12 + x, 30 + y, 17 + x, 31 + y, 26 + x, 38 + y, 30 + x, 43 + y);
        bf = floodfill(bf, 24 + x, 33 + y, Color.decode("#869d45"));
        g.setColor(Color.decode("#728536"));
        bezierCurve(g, 49 + x, 17 + y, 57 + x, 26 + y, 56 + x, 39 + y, 52 + x, 44 + y);
        bezierCurve(g, 49 + x, 17 + y, 47 + x, 16 + y, 47 + x, 45 + y, 52 + x, 44 + y);
        bf = floodfill(bf, 51 + x, 31 + y, Color.decode("#728536"));
        bezierCurve(g, 0 + x, 31 + y, 21 + x, 33 + y, 27 + x, 45 + y, 25 + x, 50 + y);
        bezierCurve(g, 0 + x, 31 + y, 1 + x, 32 + y, 7 + x, 35 + y, 14 + x, 41 + y);
        bezierCurve(g, 14 + x, 41 + y, 7 + x, 36 + y, 22 + x, 53 + y, 25 + x, 50 + y);
        bf = floodfill(bf, 16 + x, 39 + y, Color.decode("#728536"));
        bezierCurve(g, 14 + x, 12 + y, 12 + x, 22 + y, 19 + x, 30 + y, 25 + x, 30 + y);
        bezierCurve(g, 14 + x, 12 + y, 15 + x, 10 + y, 28 + x, 30 + y, 25 + x, 30 + y);
        bf = floodfill(bf, 18 + x, 23 + y, Color.decode("#728536"));
    }

    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;

            int x = (int) (Math.pow((1 - t), 3) * x1
                    + 3 * t * Math.pow((1 - t), 2) * x2
                    + 3 * Math.pow(t, 2) * (1 - t) * x3
                    + Math.pow(t, 3) * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1
                    + 3 * t * Math.pow((1 - t), 2) * y2
                    + 3 * Math.pow(t, 2) * (1 - t) * y3
                    + Math.pow(t, 3) * y4);

            plot(g, x, y);
        }
    }

    public BufferedImage floodfill(BufferedImage m, int x, int y, Color replacementColor) {
        /*
         * modify to replace color all space in line that covered by change if medthod
         * change == to =! and selectColor to replacementColor
         * because (of my lazy) we always set border area before paint color
         * anf last code we have a problem we need to use floodfill many time
         * for one ovject
         */

        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        g2.setColor(replacementColor);
        plot(g2, x, y);
        q.add(new Point(x, y));

        while (!q.isEmpty()) {
            Point p = q.poll();
            // south
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) != replacementColor.getRGB()) {
                plot(g2, p.x, p.y + 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // north
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) != replacementColor.getRGB()) {
                plot(g2, p.x, p.y - 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // east
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) != replacementColor.getRGB()) {
                plot(g2, p.x + 1, p.y);
                q.add(new Point(p.x + 1, p.y));
            }
            // west
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) != replacementColor.getRGB()) {
                plot(g2, p.x - 1, p.y);
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
            plot(g, x, y);
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

    void plot(Graphics g, int x, int y) {
        /* modify by initialize size to global variable */
        g.fillRect(x, y, size, size);
    }
}