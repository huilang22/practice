/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeDeleteAllRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeDeleteAllRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeDeleteAllRequest extends BsdAttributeConstraintTypeRequest {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeConstraintTypeDeleteAll");
  }

}
