/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GlobalContractFindNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a GlobalContractFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalContractFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalContractObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GlobalContractFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalContractFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalContractObjectDataList noOpInIn) {
    super(id, context, "GlobalContractFind");
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
        mapArray[i] = GlobalContractObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalContract", noOpIn);
      }
      addInput("GlobalContract", mapList);
    }
  }
/**
 *
 * Sets the  GlobalContract
 * @param noOpInIn GlobalContractObjectDataList to set
 *
 */
  public void setGlobalContract(GlobalContractObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalContract passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalContractObjectDataList getGlobalContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalContractObjectHelper.fromMapList(inputMap, "GlobalContractList");
  }
}
