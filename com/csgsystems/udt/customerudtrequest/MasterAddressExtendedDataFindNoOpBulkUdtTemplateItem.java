/*
 * Generated code DO NOT EDIT
 * Generated file: MasterAddressExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a MasterAddressExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MasterAddressExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MasterAddressEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MasterAddressExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MasterAddressExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressEDObjectDataList noOpInIn) {
    super(id, context, "MasterAddressExtendedDataFind");
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
        mapArray[i] = MasterAddressEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MasterAddressExtendedData", noOpIn);
      }
      addInput("MasterAddressExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  MasterAddressExtendedData
 * @param noOpInIn MasterAddressEDObjectDataList to set
 *
 */
  public void setMasterAddressExtendedData(MasterAddressEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MasterAddressExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressEDObjectDataList getMasterAddressExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MasterAddressEDObjectHelper.fromMapList(inputMap, "MasterAddressExtendedDataList");
  }
}
