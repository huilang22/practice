/*
 * Generated code DO NOT EDIT
 * Generated file: GeoAreaFindByAddressBulkUdtTemplateItem.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * Class used to create a GeoAreaFindByAddressBulkUdtTemplateItem Bulk Template
 *
 */

public class GeoAreaFindByAddressBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger addressId;
  protected Integer geoAreaTypeId;
  protected Integer languageCode;
/**
 *
 * Constructor to create a  GeoAreaFindByAddressBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public GeoAreaFindByAddressBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger addressIdIn, Integer geoAreaTypeIdIn, Integer languageCodeIn) {
    super(id, context, "GeoAreaFindByAddress");
    addressId = addressIdIn;
    geoAreaTypeId = geoAreaTypeIdIn;
    languageCode = languageCodeIn;
  }

  public void translateToMap() {
    if (addressId != null) {
      addInput("AddressId", addressId);
    }
    if (geoAreaTypeId != null) {
      addInput("GeoAreaTypeId", geoAreaTypeId);
    }
    if (languageCode != null) {
      addInput("LanguageCode", languageCode);
    }
  }


/**
 *
 * Sets the AddressId
 * @param addressIdIn Value of the addressId
 *
 */

  public void setAddressId(BigInteger addressIdIn) {
    addressId = addressIdIn;
  }

/**
 *
 * Sets the GeoAreaTypeId
 * @param geoAreaTypeIdIn Value of the geoAreaTypeId
 *
 */

  public void setGeoAreaTypeId(Integer geoAreaTypeIdIn) {
    geoAreaTypeId = geoAreaTypeIdIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param languageCodeIn Value of the languageCode
 *
 */

  public void setLanguageCode(Integer languageCodeIn) {
    languageCode = languageCodeIn;
  }

  public void translateFromMap() {
    addressId = (BigInteger)inputMap.get("AddressId");
    geoAreaTypeId = (Integer)inputMap.get("GeoAreaTypeId");
    languageCode = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return addressId;
  }

/**
 *
 * Gets the GeoAreaTypeId
 * @return Value of the GeoAreaTypeId
 *
 */

  public Integer getGeoAreaTypeId( ) {
    return geoAreaTypeId;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return languageCode;
  }

}
