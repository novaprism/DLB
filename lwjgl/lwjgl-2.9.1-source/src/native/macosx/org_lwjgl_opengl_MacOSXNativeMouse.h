/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_lwjgl_opengl_MacOSXNativeMouse */

#ifndef _Included_org_lwjgl_opengl_MacOSXNativeMouse
#define _Included_org_lwjgl_opengl_MacOSXNativeMouse
#ifdef __cplusplus
extern "C" {
#endif
#undef org_lwjgl_opengl_MacOSXNativeMouse_QUEUE_SIZE
#define org_lwjgl_opengl_MacOSXNativeMouse_QUEUE_SIZE 200L
#undef org_lwjgl_opengl_MacOSXNativeMouse_WHEEL_SCALE
#define org_lwjgl_opengl_MacOSXNativeMouse_WHEEL_SCALE 120L
#undef org_lwjgl_opengl_MacOSXNativeMouse_NUM_BUTTONS
#define org_lwjgl_opengl_MacOSXNativeMouse_NUM_BUTTONS 3L
/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nSetCursorPosition
 * Signature: (Ljava/nio/ByteBuffer;II)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nSetCursorPosition
  (JNIEnv *, jobject, jobject, jint, jint);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nGrabMouse
 * Signature: (Z)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nGrabMouse
  (JNIEnv *, jclass, jboolean);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nRegisterMouseListener
 * Signature: (Ljava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nRegisterMouseListener
  (JNIEnv *, jobject, jobject);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nUnregisterMouseListener
 * Signature: (Ljava/nio/ByteBuffer;)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nUnregisterMouseListener
  (JNIEnv *, jobject, jobject);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nCreateCursor
 * Signature: (IIIIILjava/nio/IntBuffer;ILjava/nio/IntBuffer;I)J
 */
JNIEXPORT jlong JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nCreateCursor
  (JNIEnv *, jclass, jint, jint, jint, jint, jint, jobject, jint, jobject, jint);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nDestroyCursor
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nDestroyCursor
  (JNIEnv *, jclass, jlong);

/*
 * Class:     org_lwjgl_opengl_MacOSXNativeMouse
 * Method:    nSetCursor
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_lwjgl_opengl_MacOSXNativeMouse_nSetCursor
  (JNIEnv *, jclass, jlong);

#ifdef __cplusplus
}
#endif
#endif
