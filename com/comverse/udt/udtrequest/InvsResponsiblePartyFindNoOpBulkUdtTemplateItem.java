/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsResponsiblePartyFindNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsResponsiblePartyFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsResponsiblePartyFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsResponsiblePartyObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsResponsiblePartyFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsResponsiblePartyFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsResponsiblePartyObjectDataList noOpInIn) {
    super(id, context, "InvsResponsiblePartyFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = InvsResponsiblePartyObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsResponsibleParty", noOpIn);
      }
      addInput("InvsResponsibleParty", mapList);
    }
  }
/**
 *
 * Sets the  InvsResponsibleParty
 * @param noOpInIn InvsResponsiblePartyObjectDataList to set
 *
 */
  public void setInvsResponsibleParty(InvsResponsiblePartyObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsResponsibleParty passed into the constructor
 * @return Simulated response
 *
 */
  public InvsResponsiblePartyObjectDataList getInvsResponsibleParty() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsResponsiblePartyObjectHelper.fromMapList(inputMap, "InvsResponsiblePartyList");
  }
}
