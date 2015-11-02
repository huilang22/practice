/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefValidateCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a PackageComponentDefValidateCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDefValidateCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PCDObjectData PCDin;
  protected Integer ServiceInternalId;
  protected Integer ServiceInternalIdResets;
/**
 *
 * Constructor to create a  PackageComponentDefValidateCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDefValidateCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PCDObjectData PCDinIn, Integer ServiceInternalIdIn, Integer ServiceInternalIdResetsIn) {
    super(id, context, "PackageComponentDefValidateCreate");
    PCDin = PCDinIn;
    ServiceInternalId = ServiceInternalIdIn;
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateToMap() {
    if (PCDin != null) {
      PCDin.resetFlags(true, true);
      addInput("PackageComponentDefValidate", PCDObjectHelper.toMap(PCDin, new HashMap(), "PackageComponentDefValidate").get("PackageComponentDefValidate"));
    }
    if (ServiceInternalId != null) {
      addInput("ServiceInternalId", ServiceInternalId);
    }
    if (ServiceInternalIdResets != null) {
      addInput("ServiceInternalIdResets", ServiceInternalIdResets);
    }
  }


/**
 *
 * Sets the PackageComponentDefValidate
 * @param PCDinIn Value of the PCDin
 *
 */

  public void setPackageComponentDefValidate(PCDObjectData PCDinIn) {
    PCDin = PCDinIn;
  }

/**
 *
 * Sets the ServiceInternalId
 * @param ServiceInternalIdIn Value of the ServiceInternalId
 *
 */

  public void setServiceInternalId(Integer ServiceInternalIdIn) {
    ServiceInternalId = ServiceInternalIdIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param ServiceInternalIdResetsIn Value of the ServiceInternalIdResets
 *
 */

  public void setServiceInternalIdResets(Integer ServiceInternalIdResetsIn) {
    ServiceInternalIdResets = ServiceInternalIdResetsIn;
  }

  public void translateFromMap() {
    PCDin = PCDObjectHelper.fromMap(inputMap, "PackageComponentDefValidate");
    ServiceInternalId = (Integer)inputMap.get("ServiceInternalId");
    ServiceInternalIdResets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the PackageComponentDefValidate
 * @return Value of the PackageComponentDefValidate
 *
 */

  public PCDObjectData getPackageComponentDefValidate( ) {
    return PCDin;
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return ServiceInternalId;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return ServiceInternalIdResets;
  }

}
