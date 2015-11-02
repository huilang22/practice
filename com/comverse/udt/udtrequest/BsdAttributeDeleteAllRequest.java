/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDeleteAllRequest.java
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
 * Class used to create a BsdAttributeDeleteAllRequest Udt Request
 *
 */

public class BsdAttributeDeleteAllRequest extends BsdAttributeRequest {
/**
 *
 * Constructor to create a  BsdAttributeDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeDeleteAll");
  }

}
