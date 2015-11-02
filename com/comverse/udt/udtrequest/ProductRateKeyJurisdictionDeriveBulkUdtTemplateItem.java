/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductRateKeyJurisdictionDeriveBulkUdtTemplateItem.java
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
 * Class used to create a ProductRateKeyJurisdictionDeriveBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductRateKeyJurisdictionDeriveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer TargetLocCode;
  protected Integer OriginLocCode;
  protected Date ActiveDate;
  protected Integer ElementId;
/**
 *
 * Constructor to create a  ProductRateKeyJurisdictionDeriveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductRateKeyJurisdictionDeriveBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer TargetLocCodeIn, Integer OriginLocCodeIn, Date ActiveDateIn, Integer ElementIdIn) {
    super(id, context, "ProductRateKeyJurisdictionDerive");
    TargetLocCode = TargetLocCodeIn;
    OriginLocCode = OriginLocCodeIn;
    ActiveDate = ActiveDateIn;
    ElementId = ElementIdIn;
  }

  public void translateToMap() {
    if (TargetLocCode != null) {
      addInput("TargetLocCode", TargetLocCode);
    }
    if (OriginLocCode != null) {
      addInput("OriginLocCode", OriginLocCode);
    }
    if (ActiveDate != null) {
      addInput("ActiveDate", ActiveDate);
    }
    if (ElementId != null) {
      addInput("ElementId", ElementId);
    }
  }


/**
 *
 * Sets the TargetLocCode
 * @param TargetLocCodeIn Value of the TargetLocCode
 *
 */

  public void setTargetLocCode(Integer TargetLocCodeIn) {
    TargetLocCode = TargetLocCodeIn;
  }

/**
 *
 * Sets the OriginLocCode
 * @param OriginLocCodeIn Value of the OriginLocCode
 *
 */

  public void setOriginLocCode(Integer OriginLocCodeIn) {
    OriginLocCode = OriginLocCodeIn;
  }

/**
 *
 * Sets the ActiveDate
 * @param ActiveDateIn Value of the ActiveDate
 *
 */

  public void setActiveDate(Date ActiveDateIn) {
    ActiveDate = ActiveDateIn;
  }

/**
 *
 * Sets the ElementId
 * @param ElementIdIn Value of the ElementId
 *
 */

  public void setElementId(Integer ElementIdIn) {
    ElementId = ElementIdIn;
  }

  public void translateFromMap() {
    TargetLocCode = (Integer)inputMap.get("TargetLocCode");
    OriginLocCode = (Integer)inputMap.get("OriginLocCode");
    ActiveDate = (Date)inputMap.get("ActiveDate");
    ElementId = (Integer)inputMap.get("ElementId");
  }

/**
 *
 * Gets the TargetLocCode
 * @return Value of the TargetLocCode
 *
 */

  public Integer getTargetLocCode( ) {
    return TargetLocCode;
  }

/**
 *
 * Gets the OriginLocCode
 * @return Value of the OriginLocCode
 *
 */

  public Integer getOriginLocCode( ) {
    return OriginLocCode;
  }

/**
 *
 * Gets the ActiveDate
 * @return Value of the ActiveDate
 *
 */

  public Date getActiveDate( ) {
    return ActiveDate;
  }

/**
 *
 * Gets the ElementId
 * @return Value of the ElementId
 *
 */

  public Integer getElementId( ) {
    return ElementId;
  }

}
