/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentDeleteRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CustomerDocumentDeleteRequest Udt Request
 *
 */

public class CustomerDocumentDeleteRequest extends CustomerDocumentSubRequestParent {
/**
 *
 * Constructor to create a  CustomerDocumentDeleteRequest
 * @param id Unique request name
 * @param CustomerDocumentDeleteIn CustomerDocumentObjectData for CustomerDocumentDeleteRequest
 *
 */
@JsonCreator
  public CustomerDocumentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDocument")CustomerDocumentObjectData CustomerDocumentDeleteIn) {
    super(id, "CustomerDocumentDelete");
    if (CustomerDocumentDeleteIn != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentDeleteIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }

/**
 *
 * Retrieves the CustomerDocumentObjectData that results from the CustomerDocumentDeleteRequest call
 * @return CustomerDocumentObjectData resulting from udt call
 *
 */

  public CustomerDocumentObjectData getOutput() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}
