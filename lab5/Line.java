
import java.awt.geom.Point2D;

public class Line {
    private double m, b, x;

    public Line(double usrx, double usry, double usrm) {
        m = usrm;
        b = usry - (usrm * usrx);
        x = Double.NaN;
    }

    public Line(double usrx1, double usry1, double usrx2, double usry2) {
        m = (usry2 - usry1) / (usrx2 - usrx1);
        b = usry2 - (m * usrx2);
        x = Double.NaN;
    }

    public Line(double usrm, double usrb) {
        m = usrm;
        b = usrb;
        x = Double.NaN;
    }

    public Line(double usra) {
        m = Double.NaN;
        b = Double.NaN;
        x = usra;
    }

    public boolean isParallel(Line line) {
        return (this.m == line.m);
    }

    public boolean equals(Line line) {
        return ((this.m == line.m) && (this.b == line.b));
    }

    public boolean isIntersect(Line line) {
        return (this.m != line.m);
    }

    public Point2D.Double getIntersectionPoint(Line line) {
        if (!(Double.isNaN(this.m) || Double.isNaN(line.m)) && (this.m != line.m)) {
            double interSectX = ((this.b - line.b) / (line.m - this.m));
            double interSectY = (this.m * interSectX) + this.b;
            return new Point2D.Double(interSectX, interSectY);
        }
        if (Double.isNaN(line.x)) {
            return new Point2D.Double(this.x, (line.m * this.x + line.b));
        } else {
            return new Point2D.Double(line.x, (this.m * line.x + this.b));
        }
    }

}
