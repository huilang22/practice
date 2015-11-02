/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogExternalFindBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocCatalogExternalFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCatalogExternalFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocCatalogObjectFilter SAACExFindIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogExternalFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCatalogExternalFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjectFilter SAACExFindInIn) {
    super(id, context, "ServiceAddressAssocCatalogExternalFind");
    SAACExFindIn = SAACExFindInIn;
  }

  public void translateToMap() {
    if (SAACExFindIn != null) {
      Integer index =  SAACExFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjectHelper.toMap(SAACExFindIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssocCatalog
 * @param SAACExFindInIn Value of the SAACExFindIn
 *
 */

  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjectFilter SAACExFindInIn) {
    SAACExFindIn = SAACExFindInIn;
  }

  public void translateFromMap() {
    SAACExFindIn = ServiceAddressAssocCatalogObjectHelper.fromMapFilter(inputMap, "ServiceAddressAssocCatalog");
  }

/**
 *
 * Gets the ServiceAddressAssocCatalog
 * @return Value of the ServiceAddressAssocCatalog
 *
 */

  public ServiceAddressAssocCatalogObjectFilter getServiceAddressAssocCatalog( ) {
    return SAACExFindIn;
  }

}
