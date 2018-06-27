#include <jni.h>
#include <string>
extern "C"
JNIEXPORT jstring JNICALL
Java_com_necromancer_news_engine_JNI_getAppKey(JNIEnv *env, jobject instance) {
    //  AppKey
    std::string appkey="369a11e6fb581d89d6f1eb7fa635d595";


    return env->NewStringUTF(appkey.c_str());
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_necromancer_news_SplashActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
