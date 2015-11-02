/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GeoAreaAddressAssocResetAutoBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaAddressAssocResetAutoBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaAddressAssocResetAutoBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger address_id;
/**
 *
 * Constructor to create a  GeoAreaAddressAssocResetAutoBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaAddressAssocResetAutoBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger address_idIn) {
    super(id, context, "GeoAreaAddressAssocResetAuto");
    address_id = address_idIn;
  }

  public void translateToMap() {
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
  }


/**
 *
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(BigInteger address_idIn) {
    address_id = address_idIn;
  }

  public void translateFromMap() {
    address_id = (BigInteger)inputMap.get("AddressId");
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return address_id;
  }

}
