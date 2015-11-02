/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindBulkUdtTemplateItem.java
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
 * Class used to create a MasterAddressFindBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectFilter MasterAddressFindIn;
/**
 *
 * Constructor to create a  MasterAddressFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressFindBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectFilter MasterAddressFindInIn) {
    super(id, context, "MasterAddressFind");
    MasterAddressFindIn = MasterAddressFindInIn;
  }

  public void translateToMap() {
    if (MasterAddressFindIn != null) {
      Integer index =  MasterAddressFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressFindIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param MasterAddressFindInIn Value of the MasterAddressFindIn
 *
 */

  public void setMasterAddress(MasterAddressObjectFilter MasterAddressFindInIn) {
    MasterAddressFindIn = MasterAddressFindInIn;
  }

  public void translateFromMap() {
    MasterAddressFindIn = MasterAddressObjectHelper.fromMapFilter(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectFilter getMasterAddress( ) {
    return MasterAddressFindIn;
  }

}
