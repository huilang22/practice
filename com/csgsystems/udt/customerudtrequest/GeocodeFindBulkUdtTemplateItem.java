/*
 * Generated code DO NOT EDIT
 * Generated file: GeocodeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a GeocodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class GeocodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected GeocodeAddressObjectData GeocodeAddress;
/**
 *
 * Constructor to create a  GeocodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeocodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, GeocodeAddressObjectData GeocodeAddressIn) {
    super(id, context, "GeocodeFind");
    GeocodeAddress = GeocodeAddressIn;
  }

  public void translateToMap() {
    if (GeocodeAddress != null) {
      GeocodeAddress.resetFlags(true, true);
      addInput("GeocodeAddress", GeocodeAddressObjectHelper.toMap(GeocodeAddress, new HashMap(), "Geocode").get("Geocode"));
    }
  }


/**
 *
 * Sets the GeocodeAddress
 * @param GeocodeAddressIn Value of the GeocodeAddress
 *
 */

  public void setGeocodeAddress(GeocodeAddressObjectData GeocodeAddressIn) {
    GeocodeAddress = GeocodeAddressIn;
  }

  public void translateFromMap() {
    GeocodeAddress = GeocodeAddressObjectHelper.fromMap(inputMap, "GeocodeAddress");
  }

/**
 *
 * Gets the GeocodeAddress
 * @return Value of the GeocodeAddress
 *
 */

  public GeocodeAddressObjectData getGeocodeAddress( ) {
    return GeocodeAddress;
  }

}
