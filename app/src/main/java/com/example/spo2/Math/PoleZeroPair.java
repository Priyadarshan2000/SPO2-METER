package com.example.spo2.Math;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *  Copyright (c) 2009 by Vinnie Falco
 *  Copyright (c) 2016 by Bernd Porr
 */

import org.apache.commons.math3.complex.Complex;

/**
 * It's written on the tin.
 */
public class PoleZeroPair {

    public ComplexPair poles;
    public ComplexPair zeros;

    // single pole/zero
    public PoleZeroPair(Complex p, Complex z) {
        poles = new ComplexPair(p);
        zeros = new ComplexPair(z);
    }

    // pole/zero pair
    public PoleZeroPair(Complex p1, Complex z1, Complex p2, Complex z2) {
        poles = new ComplexPair(p1, p2);
        zeros = new ComplexPair(z1, z2);
    }

    public boolean isSinglePole() {
        return poles.second.equals(new Complex(0, 0))
                && zeros.second.equals(new Complex(0, 0));
    }

    public boolean is_nan() {
        return poles.is_nan() || zeros.is_nan();
    }
}
