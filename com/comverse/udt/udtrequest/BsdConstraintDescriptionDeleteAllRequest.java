/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionDeleteAllRequest.java
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
 * Class used to create a BsdConstraintDescriptionDeleteAllRequest Udt Request
 *
 */

public class BsdConstraintDescriptionDeleteAllRequest extends BsdConstraintDescriptionRequest {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdConstraintDescriptionDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdConstraintDescriptionDeleteAll");
  }

}
