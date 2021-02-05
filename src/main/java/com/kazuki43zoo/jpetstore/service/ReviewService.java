/*
 *    Copyright 2016-2017 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.kazuki43zoo.jpetstore.service;

import com.kazuki43zoo.jpetstore.component.exception.ResourceNotFoundException;
import com.kazuki43zoo.jpetstore.domain.Category;
import com.kazuki43zoo.jpetstore.domain.Item;
import com.kazuki43zoo.jpetstore.domain.Product;
import com.kazuki43zoo.jpetstore.domain.Review;
import com.kazuki43zoo.jpetstore.mapper.CategoryMapper;
import com.kazuki43zoo.jpetstore.mapper.ItemMapper;
import com.kazuki43zoo.jpetstore.mapper.ProductMapper;
import com.kazuki43zoo.jpetstore.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kazuki Shimizu
 */
@Service
@RequiredArgsConstructor
public class ReviewService {

	private final ReviewMapper reviewMapper;

	public Review getReview(String reviewId) {
		return Optional.ofNullable(reviewMapper.getReview(reviewId))
				.orElseThrow(() -> new ResourceNotFoundException("" +
						"Review", reviewId));
	}

}