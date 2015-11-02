/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeDeleteAllRequest.java
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
 * Class used to create a BsdObjectAttributeDeleteAllRequest Udt Request
 *
 */

public class BsdObjectAttributeDeleteAllRequest extends BsdObjectAttributeRequest {
/**
 *
 * Constructor to create a  BsdObjectAttributeDeleteAllRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdObjectAttributeDeleteAllRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdObjectAttributeDeleteAll");
  }

}
