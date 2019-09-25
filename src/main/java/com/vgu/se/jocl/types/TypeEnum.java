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

@author: ngpbh
***************************************************************************/

package com.vgu.se.jocl.types;

public enum TypeEnum {
    ANYTYPE("Any"), BAGTYPE("Bag"), CLASS("Class"), INTEGERTYPE("Integer"), INVALIDTYPE("Invalid"),
    MESSAGETYPE("Message"), ORDEREDSETTYPE("OrderedSet"), REALTYPE("Real"), SEQUENCETYPE("Sequence"), SETTYPE("Set"),
    STRINGTYPE("String"), TEMPLATEPARAMETERTYPE("TemplateParameter"), TUPLETYPE("Tuple"),
    UNLIMITEDNATURALTYPE("UnlimitedNatural"), VOIDTYPE("Void");

    private String type;

    TypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
