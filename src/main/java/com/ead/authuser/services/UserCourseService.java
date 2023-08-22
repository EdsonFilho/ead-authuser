package com.ead.authuser.services;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;

import java.util.UUID;

public interface UserCourseService {

    boolean existsByUserAndCourseId(UserModel userModel, UUID courseId);

    boolean existsByCourseId(UUID courseId);

    void deleteAllByCourseId(UUID courseId);

    UserCourseModel save(UserCourseModel userCourseModel);
}

