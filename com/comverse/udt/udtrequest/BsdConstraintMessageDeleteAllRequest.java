/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageDeleteAllRequest.java
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
 * Class used to create a BsdConstraintMessageDeleteAllRequest Udt Request
 *
 */

public class BsdConstraintMessageDeleteAllRequest extends BsdConstraintMessageRequest {
/**
 *
 * Constructor to create a  BsdConstraintMessageDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdConstraintMessageDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdConstraintMessageDeleteAll");
  }

}
