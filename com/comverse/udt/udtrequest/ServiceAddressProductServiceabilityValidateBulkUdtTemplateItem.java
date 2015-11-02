/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressProductServiceabilityValidateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressProductServiceabilityValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressProductServiceabilityValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SvcAddrObjectData[] ProductValidateIn;
  protected BigInteger ProductAddress_idIn;
/**
 *
 * Constructor to create a  ServiceAddressProductServiceabilityValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressProductServiceabilityValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, SvcAddrObjectData[] ProductValidateInIn, BigInteger ProductAddress_idInIn) {
    super(id, context, "ServiceAddressProductServiceabilityValidate");
    ProductValidateIn = ProductValidateInIn;
    ProductAddress_idIn = ProductAddress_idInIn;
  }

  public void translateToMap() {
    if (ProductValidateIn != null) {
      if (ProductValidateIn != null) {
        Object[] list = new Object[ProductValidateIn.length];
        for (int i = 0; i < ProductValidateIn.length; i++) {
          list[i] = SvcAddrObjectHelper.getMap(ProductValidateIn[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "Product");
        }
        addInput("ServiceList", list);
      }
    }
    if (ProductAddress_idIn != null) {
      addInput("AddressId", ProductAddress_idIn);
    }
  }


/**
 *
 * Sets the Service
 * @param ProductValidateInIn Value of the ProductValidateIn
 *
 */

  public void setService(SvcAddrObjectData[] ProductValidateInIn) {
    ProductValidateIn = ProductValidateInIn;
  }

/**
 *
 * Sets the AddressId
 * @param ProductAddress_idInIn Value of the ProductAddress_idIn
 *
 */

  public void setAddressId(BigInteger ProductAddress_idInIn) {
    ProductAddress_idIn = ProductAddress_idInIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("ServiceList");
    if (list != null) {
      ProductValidateIn = new SvcAddrObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        ProductValidateIn[i] = SvcAddrObjectHelper.getObj((Map) list[i]);
        ProductValidateIn[i].resetFlags(true, true);
      }
    }
    ProductAddress_idIn = (BigInteger)inputMap.get("AddressId");
  }

/**
 *
 * Gets the Service
 * @return Value of the Service
 *
 */

  public SvcAddrObjectData[] getService( ) {
    return ProductValidateIn;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public BigInteger getAddressId( ) {
    return ProductAddress_idIn;
  }

}
