/**************************************************************************
Copyright 2019 Vietnamese-German-University

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

@author: thian
***************************************************************************/


package com.vgu.se.jocl.parser.interfaces;

import org.json.simple.JSONArray;

import com.vgu.se.jocl.expressions.Expression;
import com.vgu.se.jocl.expressions.OclExp;
import com.vgu.se.jocl.expressions.Variable;
import com.vgu.se.jocl.parser.simple.SimpleParser;
import com.vgu.se.jocl.visit.ParserVisitor;

public interface Parser {
    
    Expression parse(String ocl, JSONArray ctx);

    void putAdhocContextualSet(Variable var);
    
}
