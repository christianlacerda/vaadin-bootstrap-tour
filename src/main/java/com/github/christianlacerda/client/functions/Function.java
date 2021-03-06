package com.github.christianlacerda.client.functions;

/*
 * #%L
 * GwtBootstrapTour
 * %%
 * Copyright (C) 2013 - 2014 Christian Lacerda
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.github.christianlacerda.client.Tour;

/**
 * Generic interface to use as callback
 * Created by christian on 19/08/14.
 */
public interface Function {

    void execute(Tour tour);
}
