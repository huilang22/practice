/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressUpdateBulkUdtTemplateItem.java
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
 * Class used to create a MasterAddressUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class MasterAddressUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected MasterAddressObjectData MasterAddressUpdateIn;
/**
 *
 * Constructor to create a  MasterAddressUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public MasterAddressUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, MasterAddressObjectData MasterAddressUpdateInIn) {
    super(id, context, "MasterAddressUpdate");
    MasterAddressUpdateIn = MasterAddressUpdateInIn;
  }

  public void translateToMap() {
    if (MasterAddressUpdateIn != null) {
      MasterAddressUpdateIn.resetFlags(true, true);
      addInput("MasterAddress", MasterAddressObjectHelper.toMap(MasterAddressUpdateIn, new HashMap(), "MasterAddress").get("MasterAddress"));
    }
  }


/**
 *
 * Sets the MasterAddress
 * @param MasterAddressUpdateInIn Value of the MasterAddressUpdateIn
 *
 */

  public void setMasterAddress(MasterAddressObjectData MasterAddressUpdateInIn) {
    MasterAddressUpdateIn = MasterAddressUpdateInIn;
  }

  public void translateFromMap() {
    MasterAddressUpdateIn = MasterAddressObjectHelper.fromMap(inputMap, "MasterAddress");
  }

/**
 *
 * Gets the MasterAddress
 * @return Value of the MasterAddress
 *
 */

  public MasterAddressObjectData getMasterAddress( ) {
    return MasterAddressUpdateIn;
  }

}
