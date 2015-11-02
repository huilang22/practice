/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogCreateBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceAddressAssocCatalogCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCatalogCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocCatalogObjData createIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCatalogCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjData createInIn) {
    super(id, context, "ServiceAddressAssocCatalogCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(createIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssocCatalog
 * @param createInIn Value of the createIn
 *
 */

  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = ServiceAddressAssocCatalogObjHelper.fromMap(inputMap, "ServiceAddressAssocCatalog");
  }

/**
 *
 * Gets the ServiceAddressAssocCatalog
 * @return Value of the ServiceAddressAssocCatalog
 *
 */

  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalog( ) {
    return createIn;
  }

}
