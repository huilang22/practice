/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocFindRequest.java
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
 * Class used to create a InvsLocationDetailAssocFindRequest Udt Request
 *
 */

public class InvsLocationDetailAssocFindRequest extends InvsLocationDetailAssocRequest {
/**
 *
 * Constructor to create a  InvsLocationDetailAssocFindRequest
 * @param id Unique request name
 * @param InvsLocationDetailAssocFindIn InvsLocationTablesObjectFilter for InvsLocationDetailAssocFindRequest
 *
 */
@JsonCreator
  public InvsLocationDetailAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetailAssoc")InvsLocationTablesObjectFilter InvsLocationDetailAssocFindIn) {
    super(id, "InvsLocationDetailAssocFind");
    if (InvsLocationDetailAssocFindIn != null) {
      Integer index =  InvsLocationDetailAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationDetailAssoc", InvsLocationTablesObjectHelper.toMap(InvsLocationDetailAssocFindIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsLocationTablesObjectDataList that results from the InvsLocationDetailAssocFindRequest call
 * @return InvsLocationTablesObjectDataList resulting from udt call
 *
 */

  public InvsLocationTablesObjectDataList getOutput() {
    return InvsLocationTablesObjectHelper.fromMapList(outputMap, "InvsLocationDetailAssocList");
  }
}
