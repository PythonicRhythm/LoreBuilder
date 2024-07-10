import { TestBed } from '@angular/core/testing';

import { DBfetchService } from './dbfetch.service';

describe('DBfetchService', () => {
  let service: DBfetchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DBfetchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
