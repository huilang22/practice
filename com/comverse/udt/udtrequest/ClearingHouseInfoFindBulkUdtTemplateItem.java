/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClearingHouseInfoFindBulkUdtTemplateItem.java
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
 * Class used to create a ClearingHouseInfoFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ClearingHouseInfoFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ClearingHouseInfoObjectFilter CHIFindIn;
/**
 *
 * Constructor to create a  ClearingHouseInfoFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ClearingHouseInfoFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseInfoObjectFilter CHIFindInIn) {
    super(id, context, "ClearingHouseInfoFind");
    CHIFindIn = CHIFindInIn;
  }

  public void translateToMap() {
    if (CHIFindIn != null) {
      Integer index =  CHIFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ClearingHouseInfo", ClearingHouseInfoObjectHelper.toMap(CHIFindIn, new HashMap(), "ClearingHouseInfo").get("ClearingHouseInfo"));
    }
  }


/**
 *
 * Sets the ClearingHouseInfo
 * @param CHIFindInIn Value of the CHIFindIn
 *
 */

  public void setClearingHouseInfo(ClearingHouseInfoObjectFilter CHIFindInIn) {
    CHIFindIn = CHIFindInIn;
  }

  public void translateFromMap() {
    CHIFindIn = ClearingHouseInfoObjectHelper.fromMapFilter(inputMap, "ClearingHouseInfo");
  }

/**
 *
 * Gets the ClearingHouseInfo
 * @return Value of the ClearingHouseInfo
 *
 */

  public ClearingHouseInfoObjectFilter getClearingHouseInfo( ) {
    return CHIFindIn;
  }

}
