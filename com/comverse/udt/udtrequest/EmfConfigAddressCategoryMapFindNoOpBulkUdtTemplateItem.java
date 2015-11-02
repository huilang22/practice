/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a EmfConfigAddressCategoryMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigAddressCategoryMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected EmfConfigAddressCategoryMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   EmfConfigAddressCategoryMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigAddressCategoryMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectDataList noOpInIn) {
    super(id, context, "EmfConfigAddressCategoryMapFind");
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
        mapArray[i] = EmfConfigAddressCategoryMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfigAddressCategoryMap", noOpIn);
      }
      addInput("EmfConfigAddressCategoryMap", mapList);
    }
  }
/**
 *
 * Sets the  EmfConfigAddressCategoryMap
 * @param noOpInIn EmfConfigAddressCategoryMapObjectDataList to set
 *
 */
  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfigAddressCategoryMap passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigAddressCategoryMapObjectDataList getEmfConfigAddressCategoryMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = EmfConfigAddressCategoryMapObjectHelper.fromMapList(inputMap, "EmfConfigAddressCategoryMapList");
  }
}
