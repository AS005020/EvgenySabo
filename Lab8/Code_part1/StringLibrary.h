#pragma once

#ifdef STRINGLIBRARY_EXPORTS
#define STRINGLIBRARY_API __declspec(dllexport)
#else
#define STRINGLIBRARY_API __declspec(dllimport)
#endif

extern "C" STRINGLIBRARY_API void to_upper(
    char* str);