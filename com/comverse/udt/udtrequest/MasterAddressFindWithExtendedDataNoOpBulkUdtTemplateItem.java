/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindWithExtendedDataNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a MasterAddressFindWithExtendedDataNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MasterAddressFindWithExtendedDataNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MasterAddressObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MasterAddressFindWithExtendedDataNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MasterAddressFindWithExtendedDataNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectDataList noOpInIn) {
    super(id, context, "MasterAddressFindWithExtendedData");
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
        mapArray[i] = MasterAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MasterAddress", noOpIn);
      }
      addInput("MasterAddress", mapList);
    }
  }
/**
 *
 * Sets the  MasterAddress
 * @param noOpInIn MasterAddressObjectDataList to set
 *
 */
  public void setMasterAddress(MasterAddressObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MasterAddress passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressObjectDataList getMasterAddress() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MasterAddressObjectHelper.fromMapList(inputMap, "MasterAddressList");
  }
}
