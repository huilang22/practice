/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConvertGeocodeBulkUdtTemplateItem.java
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
 * Class used to create a ConvertGeocodeBulkUdtTemplateItem Bulk Template
 *
 */

public class ConvertGeocodeBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer CountryCode;
  protected Integer FranchiseCode;
  protected String VertexGeocode;
/**
 *
 * Constructor to create a  ConvertGeocodeBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ConvertGeocodeBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer CountryCodeIn, Integer FranchiseCodeIn, String VertexGeocodeIn) {
    super(id, context, "ConvertGeocode");
    CountryCode = CountryCodeIn;
    FranchiseCode = FranchiseCodeIn;
    VertexGeocode = VertexGeocodeIn;
  }

  public void translateToMap() {
    if (CountryCode != null) {
      addInput("CountryCode", CountryCode);
    }
    if (FranchiseCode != null) {
      addInput("FranchiseCode", FranchiseCode);
    }
    if (VertexGeocode != null) {
      addInput("VertexGeocode", VertexGeocode);
    }
  }


/**
 *
 * Sets the CountryCode
 * @param CountryCodeIn Value of the CountryCode
 *
 */

  public void setCountryCode(Integer CountryCodeIn) {
    CountryCode = CountryCodeIn;
  }

/**
 *
 * Sets the FranchiseCode
 * @param FranchiseCodeIn Value of the FranchiseCode
 *
 */

  public void setFranchiseCode(Integer FranchiseCodeIn) {
    FranchiseCode = FranchiseCodeIn;
  }

/**
 *
 * Sets the VertexGeocode
 * @param VertexGeocodeIn Value of the VertexGeocode
 *
 */

  public void setVertexGeocode(String VertexGeocodeIn) {
    VertexGeocode = VertexGeocodeIn;
  }

  public void translateFromMap() {
    CountryCode = (Integer)inputMap.get("CountryCode");
    FranchiseCode = (Integer)inputMap.get("FranchiseCode");
    VertexGeocode = (String)inputMap.get("VertexGeocode");
  }

/**
 *
 * Gets the CountryCode
 * @return Value of the CountryCode
 *
 */

  public Integer getCountryCode( ) {
    return CountryCode;
  }

/**
 *
 * Gets the FranchiseCode
 * @return Value of the FranchiseCode
 *
 */

  public Integer getFranchiseCode( ) {
    return FranchiseCode;
  }

/**
 *
 * Gets the VertexGeocode
 * @return Value of the VertexGeocode
 *
 */

  public String getVertexGeocode( ) {
    return VertexGeocode;
  }

}
