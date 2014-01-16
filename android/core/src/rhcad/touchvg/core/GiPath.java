/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package rhcad.touchvg.core;

public class GiPath {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected GiPath(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GiPath obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        touchvgJNI.delete_GiPath(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GiPath() {
    this(touchvgJNI.new_GiPath__SWIG_0(), true);
  }

  public GiPath(GiPath src) {
    this(touchvgJNI.new_GiPath__SWIG_1(GiPath.getCPtr(src), src), true);
  }

  public GiPath(int count, Point2d points, String types) {
    this(touchvgJNI.new_GiPath__SWIG_2(count, Point2d.getCPtr(points), points, types), true);
  }

  public GiPath copy(GiPath src) {
    return new GiPath(touchvgJNI.GiPath_copy(swigCPtr, this, GiPath.getCPtr(src), src), false);
  }

  public boolean genericRoundLines(int count, Point2d points, float radius, boolean closed) {
    return touchvgJNI.GiPath_genericRoundLines__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, radius, closed);
  }

  public boolean genericRoundLines(int count, Point2d points, float radius) {
    return touchvgJNI.GiPath_genericRoundLines__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points, radius);
  }

  public int getCount() {
    return touchvgJNI.GiPath_getCount(swigCPtr, this);
  }

  public Point2d getPoints() {
    long cPtr = touchvgJNI.GiPath_getPoints(swigCPtr, this);
    return (cPtr == 0) ? null : new Point2d(cPtr, false);
  }

  public String getTypes() {
    return touchvgJNI.GiPath_getTypes(swigCPtr, this);
  }

  public void clear() {
    touchvgJNI.GiPath_clear(swigCPtr, this);
  }

  public void transform(Matrix2d mat) {
    touchvgJNI.GiPath_transform(swigCPtr, this, Matrix2d.getCPtr(mat), mat);
  }

  public void startFigure() {
    touchvgJNI.GiPath_startFigure(swigCPtr, this);
  }

  public boolean moveTo(Point2d point) {
    return touchvgJNI.GiPath_moveTo(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean lineTo(Point2d point) {
    return touchvgJNI.GiPath_lineTo(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean linesTo(int count, Point2d points) {
    return touchvgJNI.GiPath_linesTo(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public boolean beziersTo(int count, Point2d points, boolean reverse) {
    return touchvgJNI.GiPath_beziersTo__SWIG_0(swigCPtr, this, count, Point2d.getCPtr(points), points, reverse);
  }

  public boolean beziersTo(int count, Point2d points) {
    return touchvgJNI.GiPath_beziersTo__SWIG_1(swigCPtr, this, count, Point2d.getCPtr(points), points);
  }

  public boolean arcTo(Point2d point) {
    return touchvgJNI.GiPath_arcTo__SWIG_0(swigCPtr, this, Point2d.getCPtr(point), point);
  }

  public boolean arcTo(Point2d point, Point2d end) {
    return touchvgJNI.GiPath_arcTo__SWIG_1(swigCPtr, this, Point2d.getCPtr(point), point, Point2d.getCPtr(end), end);
  }

  public boolean closeFigure() {
    return touchvgJNI.GiPath_closeFigure(swigCPtr, this);
  }

}