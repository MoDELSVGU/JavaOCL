# JavaOCL
A representation of OCL expression in Java.

```
<dependency>
  <groupId>io.github.modelsvgu</groupId>
  <artifactId>oclj</artifactId>
  <version>1.0.0</version>
</dependency>
```
 
This table represents a detailed overview of supported Object Constraint Language (OCL) operators. It consists of several categories, in which contains 2 columns: the operator (on the left) and the syntax example (on the right).

##### Class operations
|||
|--------------------------|---|
|`allInstances`  |  *class*.`allInstances()` |
|`attributes`  |  *var*.`att` |
|`association ends`  |  *var*.`assoc` |

##### Constants operations
|||
|--------------------------|---|
|`Boolean Literal`  |  `{TRUE, FALSE}`|
|`Integer Literal`  |  `{..., -2, 1, 0, 1, 2, ...}`|
|`String Literal`  |  `'string'`|

##### Boolean operations
|||
|--------------------------|---|
|`not`  |  `NOT` *bool-expr* |
|`and`, `or`| *bool-expr* `logic-operator` *bool-expr'*|
| =, <>, >, <, &#8805;, &#8804;  |  *bool-expr* `compare-operator` *bool-expr'*|

##### Iterative operations
|||
|--------------------------|---|
|`collect`  |  *source-expr* -> `collect`(*var* &#124; *body-expr*) |
|`forAll`  |  *source-expr* -> `forAll`(*var* &#124; *bool-expr*) |
|`exists`  |  *source-expr* -> `exists`(*var* &#124; *bool-expr*) |
|`select`  |  *source-expr* -> `select`(*var* &#124; *bool-expr*) |
|`reject`  |  *source-expr* -> `reject`(*var* &#124; *bool-expr*) |
|`size`  |  *source-expr* -> `size()`|
|`isEmpty`  |  *source-expr* -> `isEmpty()`|
|`notEmpty`  |  *source-expr* -> `notEmpty()`|
|`isUnique`  |  *source-expr* -> `isUnique()`|
|`flatten`[<sup>1</sup>]  |  *source-expr* -> `flatten()`|

###### [<sup>1</sup>] For the time being, this can operate *ONLY* after the `collect` operation
[<sup>1</sup>]:#-For
