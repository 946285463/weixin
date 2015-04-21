#include <jni.h>
#include "com_niu_testjni_NativeClass.h"
#ifdef __cplusplus

extern "C" {
#endif
	/**
	 *com_niu_testjni_NativeClass
	 */
	JNIEXPORT jboolean JNICALL Java_com_niu_testjni_NativeClass_jniArrayAdd(JNIEnv * env, jclass, jintArray array, jint b){
		jsize size = env->GetArrayLength(array);

		jboolean isCopy;
		jint* pArray = (jint*)env->GetPrimitiveArrayCritical(array, &isCopy);
		for (int i = 0; i < size; i++) {
			pArray[i] += b;
		}
		env->ReleasePrimitiveArrayCritical(array, pArray, JNI_COMMIT);

		return isCopy;
	}

	JNIEXPORT jintArray JNICALL Java_com_niu_textjni_NativeClass_jniArrayMul(JNIEnv * env, jclass, jintArray array, jint b){
		jsize size = env->GetArrayLength(array);
		jintArray product = env->NewIntArray(size);
		jint* pArray = (jint*)env->GetPrimitiveArrayCritical(array, 0);
		jint* pProduct = (jint*)env->GetPrimitiveArrayCritical(product, 0);

		for (int i = 0; i < size; i++) {
			pProduct[i] = pArray[i]* b;
		}

		env->ReleasePrimitiveArrayCritical(array, pArray, JNI_COMMIT);
		env->ReleasePrimitiveArrayCritical(product, pProduct, JNI_COMMIT);

		return product;
	}
#ifdef __cplusplus
}
#endif
