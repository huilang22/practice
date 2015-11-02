/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExtendedDataFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcExtendedDataFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcExtendedDataFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcEDObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcExtendedDataFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcExtendedDataFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcEDObjectDataList noOpInIn) {
    super(id, context, "NrcExtendedDataFind");
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
        mapArray[i] = NrcEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcExtendedData", noOpIn);
      }
      addInput("NrcExtendedData", mapList);
    }
  }
/**
 *
 * Sets the  NrcExtendedData
 * @param noOpInIn NrcEDObjectDataList to set
 *
 */
  public void setNrcExtendedData(NrcEDObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcExtendedData passed into the constructor
 * @return Simulated response
 *
 */
  public NrcEDObjectDataList getNrcExtendedData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcEDObjectHelper.fromMapList(inputMap, "NrcExtendedDataList");
  }
}
