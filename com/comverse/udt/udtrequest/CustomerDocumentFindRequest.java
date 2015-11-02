/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentFindRequest.java
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
 * Class used to create a CustomerDocumentFindRequest Udt Request
 *
 */

public class CustomerDocumentFindRequest extends CustomerDocumentRequest {
/**
 *
 * Constructor to create a  CustomerDocumentFindRequest
 * @param id Unique request name
 * @param CustomerDocumentFindIn CustomerDocumentObjectFilter for CustomerDocumentFindRequest
 *
 */
@JsonCreator
  public CustomerDocumentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDocument")CustomerDocumentObjectFilter CustomerDocumentFindIn) {
    super(id, "CustomerDocumentFind");
    if (CustomerDocumentFindIn != null) {
      Integer index =  CustomerDocumentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentFindIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }

/**
 *
 * Retrieves the CustomerDocumentObjectDataList that results from the CustomerDocumentFindRequest call
 * @return CustomerDocumentObjectDataList resulting from udt call
 *
 */

  public CustomerDocumentObjectDataList getOutput() {
    return CustomerDocumentObjectHelper.fromMapList(outputMap, "CustomerDocumentList");
  }
}
