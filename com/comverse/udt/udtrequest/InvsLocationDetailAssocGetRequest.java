/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocGetRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsLocationDetailAssocGetRequest Udt Request
 *
 */

public class InvsLocationDetailAssocGetRequest extends InvsLocationDetailAssocSubRequestParent {
/**
 *
 * Constructor to create a  InvsLocationDetailAssocGetRequest
 * @param id Unique request name
 * @param InvsLocationDetailAssocGetIn InvsLocationTablesObjectKeyData for InvsLocationDetailAssocGetRequest
 *
 */
@JsonCreator
  public InvsLocationDetailAssocGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetailAssoc")InvsLocationTablesObjectKeyData InvsLocationDetailAssocGetIn) {
    super(id, "InvsLocationDetailAssocGet");
    if (InvsLocationDetailAssocGetIn != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectKeyHelper.toMap(InvsLocationDetailAssocGetIn, new HashMap(), "InvsLocationTablesObjectKeyData").get("InvsLocationTablesObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsLocationTablesObjectData that results from the InvsLocationDetailAssocGetRequest call
 * @return InvsLocationTablesObjectData resulting from udt call
 *
 */

  public InvsLocationTablesObjectData getOutput() {
    return InvsLocationTablesObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
}
