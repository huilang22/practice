/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a MasterAddressFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectFilter MAFindWithIn;
/**
 *
 * Constructor to create a  MasterAddressFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectFilter MAFindWithInIn) {
    super(id, context, "MasterAddressFindWithExtendedData");
    MAFindWithIn = MAFindWithInIn;
  }

  public void translateToMap() {
    if (MAFindWithIn != null) {
      Integer index =  MAFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MAFindWithIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param MAFindWithInIn Value of the MAFindWithIn
 *
 */

  public void setMasterAddress(MasterAddressObjectFilter MAFindWithInIn) {
    MAFindWithIn = MAFindWithInIn;
  }

  public void translateFromMap() {
    MAFindWithIn = MasterAddressObjectHelper.fromMapFilter(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectFilter getMasterAddress( ) {
    return MAFindWithIn;
  }

}
