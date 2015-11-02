/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeDeleteAllRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BsdRelationalConstraintTypeDeleteAllRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeDeleteAllRequest extends BsdRelationalConstraintTypeRequest {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdRelationalConstraintTypeDeleteAll");
  }

}
