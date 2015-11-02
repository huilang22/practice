/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentTxnFieldAssocFindRequest.java
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
 * Class used to create a InvsEquipmentTxnFieldAssocFindRequest Udt Request
 *
 */

public class InvsEquipmentTxnFieldAssocFindRequest extends InvsEquipmentTxnFieldAssocRequest {
/**
 *
 * Constructor to create a  InvsEquipmentTxnFieldAssocFindRequest
 * @param id Unique request name
 * @param IETFAFindIn InvsEquipmentTxnFieldTablesObjectFilter for InvsEquipmentTxnFieldAssocFindRequest
 *
 */
@JsonCreator
  public InvsEquipmentTxnFieldAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentTxnFieldAssoc")InvsEquipmentTxnFieldTablesObjectFilter IETFAFindIn) {
    super(id, "InvsEquipmentTxnFieldAssocFind");
    if (IETFAFindIn != null) {
      Integer index =  IETFAFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsEquipmentTxnFieldAssoc", InvsEquipmentTxnFieldTablesObjectHelper.toMap(IETFAFindIn, new HashMap(), "InvsEquipmentTxnFieldAssoc").get("InvsEquipmentTxnFieldAssoc"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentTxnFieldTablesObjectDataList that results from the InvsEquipmentTxnFieldAssocFindRequest call
 * @return InvsEquipmentTxnFieldTablesObjectDataList resulting from udt call
 *
 */

  public InvsEquipmentTxnFieldTablesObjectDataList getOutput() {
    return InvsEquipmentTxnFieldTablesObjectHelper.fromMapList(outputMap, "InvsEquipmentTxnFieldAssocList");
  }
}
