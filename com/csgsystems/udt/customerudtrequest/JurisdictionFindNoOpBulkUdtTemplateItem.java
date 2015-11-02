/*
 * Generated code DO NOT EDIT
 * Generated file: JurisdictionFindNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a JurisdictionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class JurisdictionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected JurisdictionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   JurisdictionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public JurisdictionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, JurisdictionObjectDataList noOpInIn) {
    super(id, context, "JurisdictionFind");
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
        mapArray[i] = JurisdictionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Jurisdiction", noOpIn);
      }
      addInput("Jurisdiction", mapList);
    }
  }
/**
 *
 * Sets the  Jurisdiction
 * @param noOpInIn JurisdictionObjectDataList to set
 *
 */
  public void setJurisdiction(JurisdictionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Jurisdiction passed into the constructor
 * @return Simulated response
 *
 */
  public JurisdictionObjectDataList getJurisdiction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = JurisdictionObjectHelper.fromMapList(inputMap, "JurisdictionList");
  }
}
